package com.fang.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangning 2016年7月22日 检验是否登录的过滤器
 */
public class LoginFilter implements Filter {
	private String uncheckUrls;
	private String sessionKey;
	//private String username;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (request instanceof HttpServletRequest && response instanceof HttpServletResponse) {
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse resp = (HttpServletResponse) response;
			String path = req.getServletPath();
			if (uncheckUrls.indexOf(path) > -1) {// 不需要检查
				chain.doFilter(req, resp);
			} else {
				String username = (String) req.getSession().getAttribute(sessionKey);
				if (username != null && !"".equals(username)) {
					
					chain.doFilter(req, resp);
				}else{
					
					resp.sendRedirect(req.getContextPath()+"/login.jsp");
				}
			}
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		ServletContext context = config.getServletContext();
		sessionKey = context.getInitParameter("sessionKey");
		uncheckUrls = context.getInitParameter("unchekurl");
	}

}
