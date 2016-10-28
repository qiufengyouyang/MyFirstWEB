本引用提供了几个关于支付项目常用的几个方法。适用于.NET开发人员使用。请把所有待提交的参数放入SortedDictionary中

添加本引用椭罂梢允褂靡幌录父龇椒ǎ?

1.根据参数构造自提交表单(SortedDictionary不用包含sign字段，方法会根据参数signkey自动生成sign到表单中)
/// <summary>
/// 根据参数构造自提交表单
/// </summary>
/// <param name="sdic">待提交参数字典</param>
/// <param name="signkey">签名密钥(支付产品分配的MD5密钥)</param>
/// <param name="charset">编码格式(默认utf-8)</param>
/// <param name="getway">请求地址</param>
/// <returns>表单请求串</returns>
PaymentEncryptTool.BuildRequestForm(SortedDictionary<string, string> sdic, string signkey, string getway, string charset = "utf-8");

2.生成MD5签名结果(SortedDictionary不用包含sign字段)
/// <summary>
/// 生成MD5签名结果
/// </summary>
/// <param name="sortdic">请求前的参数数组</param>
/// <param name="signkey">签名密钥(支付产品分配的MD5密钥)</param>
/// <param name="charset">编码格式(默认utf-8)</param>
/// <returns>MD5签名结果</returns>
PaymentEncryptTool.GetSignResult(SortedDictionary<string, string> sortdic, string signkey, string charset = "utf-8");

3.生成待签名的字符串(SortedDictionary不用包含sign字段)
/// <summary>
/// 生成待签名的字符串
/// </summary>
/// <param name="sortdic">请求前的参数数组</param>
/// <param name="charset">编码格式</param>
/// <returns>待签名的字符串</returns>
PaymentEncryptTool.GetPreSignString(SortedDictionary<string, string> sortdic, string charset = "utf-8");

4.DES加密方法(绝大多数情况编码格式都是GB2312的，如果不写默认utf-8)
/// <summary>
/// DES加密方法
/// </summary>
/// <param name="input">待加密的字符串</param>
/// <param name="password">加密的密码（只能为8位长）</param>
/// <param name="encoding">编码方式(默认utf-8)</param>
/// <returns>加密之后的文本（Passpord返回16进制编码后的加密串）</returns>
PaymentEncryptTool.EncryptForPassport(string input, string password, Encoding encoding = null);

5.DES解密方法(绝大多数情况编码格式都是GB2312的，如果不写默认utf-8)
/// <summary>
/// DES解密方法
/// </summary>
/// <param name="input">待加密的字符串</param>
/// <param name="password">加密的密码（只能为8位长）</param>
/// <param name="encoding">编码方式(默认utf-8)</param>
/// <returns>解密结果</returns>
PaymentEncryptTool.DecryptForPassport(string input, string password, Encoding encoding = null);