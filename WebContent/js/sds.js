function alphanum(a, b) {
	function c(a) {
		for (var b, c, d = [], e = 0, f = -1, g = 0; b = (c = a.charAt(e++)).charCodeAt(0);) {
			var h = 46 === b || b >= 48 && 57 >= b;
			h !== g && (d[++f] = "", g = h), d[f] += c
		}
		return d
	}
	var d = c(a),
		e = c(b);
	for (x = 0; d[x] && e[x]; x++) if (d[x] !== e[x]) {
		var f = Number(d[x]),
			g = Number(e[x]);
		return f == d[x] && g == e[x] ? f - g : d[x] > e[x] ? 1 : -1
	}
	return d.length - e.length
}!
function(a) {
	"use strict";
	var b = 37,
		c = null,
		d = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAATCAYAAAByUDbMAAAAZ0lEQVQ4y2NgGLKgquEuFxBPAGI2ahhWCsS/gDibUoO0gPgxEP8H4ttArEyuQYxAPBdqEAxPBImTY5gjEL9DM+wTENuQahAvEO9DMwiGdwAxOymGJQLxTyD+jgWDxCMZRsEoGAVoAADeemwtPcZI2wAAAABJRU5ErkJggg==",
		e = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAATCAQAAADYWf5HAAAAkElEQVQoz7XQMQ5AQBCF4dWQSJxC5wwax1Cq1e7BAdxD5SL+Tq/QCM1oNiJidwox0355mXnG/DrEtIQ6azioNZQxI0ykPhTQIwhCR+BmBYtlK7kLJYwWCcJA9M4qdrZrd8pPjZWPtOqdRQy320YSV17OatFC4euts6z39GYMKRPCTKY9UnPQ6P+GtMRfGtPnBCiqhAeJPmkqAAAAAElFTkSuQmCC",
		f = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAATCAYAAAByUDbMAAAAZUlEQVQ4y2NgGAWjYBSggaqGu5FA/BOIv2PBIPFEUgxjB+IdQPwfC94HxLykus4GiD+hGfQOiB3J8SojEE9EM2wuSJzcsFMG4ttQgx4DsRalkZENxL+AuJQaMcsGxBOAmGvopk8AVz1sLZgg0bsAAAAASUVORK5CYII= ",
		g = function(a) {
			var b = arguments,
				c = !0,
				d = 1;
			return a = a.replace(/%s/g, function() {
				var a = b[d++];
				return "undefined" == typeof a ? (c = !1, "") : a
			}), c ? a : ""
		},
		h = function(b, c, d, e) {
			var f = "";
			return a.each(b, function(a, b) {
				return b[c] === e ? (f = b[d], !1) : !0
			}), f
		},
		i = function(b, c) {
			var d = -1;
			return a.each(b, function(a, b) {
				return b.field === c ? (d = a, !1) : !0
			}), d
		},
		j = function() {
			if (null === c) {
				var b, d, e = a("<p/>").addClass("fixed-table-scroll-inner"),
					f = a("<div/>").addClass("fixed-table-scroll-outer");
				f.append(e), a("body").append(f), b = e[0].offsetWidth, f.css("overflow", "scroll"), d = e[0].offsetWidth, b === d && (d = f[0].clientWidth), f.remove(), c = b - d
			}
			return c
		},
		k = function(b, c, d, e) {
			var f = c;
			if ("string" == typeof c) {
				var h = c.split(".");
				h.length > 1 ? (f = window, a.each(h, function(a, b) {
					f = f[b]
				})) : f = window[c]
			}
			return "object" == typeof f ? f : "function" == typeof f ? f.apply(b, d) : !f && "string" == typeof c && g.apply(this, [c].concat(d)) ? g.apply(this, [c].concat(d)) : e
		},
		l = function(a) {
			return "string" == typeof a ? a.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;").replace(/"/g, "&quot;").replace(/'/g, "&#039;") : a
		},
		m = function(b) {
			var c = 0;
			return b.children().each(function() {
				c < a(this).outerHeight(!0) && (c = a(this).outerHeight(!0))
			}), c
		},
		n = function(a) {
			for (var b in a) {
				var c = b.split(/(?=[A-Z])/).join("-").toLowerCase();
				c !== b && (a[c] = a[b], delete a[b])
			}
			return a
		},
		o = function(b, c) {
			this.options = c, this.$el = a(b), this.$el_ = this.$el.clone(), this.timeoutId_ = 0, this.timeoutFooter_ = 0, this.init()
		};
	o.DEFAULTS = {
		classes: "table table-hover",
		height: void 0,
		undefinedText: "-",
		sortName: void 0,
		sortOrder: "asc",
		striped: !1,
		columns: [],
		data: [],
		method: "get",
		url: void 0,
		ajax: void 0,
		cache: !0,
		contentType: "application/json",
		dataType: "json",
		ajaxOptions: {},
		queryParams: function(a) {
			return a
		},
		queryParamsType: "limit",
		responseHandler: function(a) {
			return a
		},
		pagination: !1,
		sidePagination: "client",
		totalRows: 0,
		pageNumber: 1,
		pageSize: 10,
		pageList: [10, 25, 50, 100],
		paginationHAlign: "right",
		paginationVAlign: "bottom",
		paginationDetailHAlign: "left",
		paginationFirstText: "&laquo;",
		paginationPreText: "&lsaquo;",
		paginationNextText: "&rsaquo;",
		paginationLastText: "&raquo;",
		search: !1,
		searchAlign: "right",
		selectItemName: "btSelectItem",
		showHeader: !0,
		showFooter: !1,
		showColumns: !1,
		showPaginationSwitch: !1,
		showRefresh: !1,
		showToggle: !1,
		buttonsAlign: "right",
		smartDisplay: !0,
		minimumCountColumns: 1,
		idField: void 0,
		uniqueId: void 0,
		cardView: !1,
		detailView: !1,
		detailFormatter: function() {
			return ""
		},
		trimOnSearch: !0,
		clickToSelect: !1,
		singleSelect: !1,
		toolbar: void 0,
		toolbarAlign: "left",
		checkboxHeader: !0,
		sortable: !0,
		maintainSelected: !1,
		searchTimeOut: 500,
		searchText: "",
		iconSize: void 0,
		iconsPrefix: "glyphicon",
		icons: {
			paginationSwitchDown: "glyphicon-collapse-down icon-chevron-down",
			paginationSwitchUp: "glyphicon-collapse-up icon-chevron-up",
			refresh: "glyphicon-refresh icon-refresh",
			toggle: "glyphicon-list-alt icon-list-alt",
			columns: "glyphicon-th icon-th"
		},
		rowStyle: function() {
			return {}
		},
		rowAttributes: function() {
			return {}
		},
		onAll: function() {
			return !1
		},
		onClickCell: function() {
			return !1
		},
		onDblClickCell: function() {
			return !1
		},
		onClickRow: function() {
			return !1
		},
		onDblClickRow: function() {
			return !1
		},
		onSort: function() {
			return !1
		},
		onCheck: function() {
			return !1
		},
		onUncheck: function() {
			return !1
		},
		onCheckAll: function() {
			return !1
		},
		onUncheckAll: function() {
			return !1
		},
		onCheckSome: function() {
			return !1
		},
		onUncheckSome: function() {
			return !1
		},
		onLoadSuccess: function() {
			return !1
		},
		onLoadError: function() {
			return !1
		},
		onColumnSwitch: function() {
			return !1
		},
		onPageChange: function() {
			return !1
		},
		onSearch: function() {
			return !1
		},
		onToggle: function() {
			return !1
		},
		onPreBody: function() {
			return !1
		},
		onPostBody: function() {
			return !1
		},
		onPostHeader: function() {
			return !1
		},
		onExpandRow: function() {
			return !1
		},
		onCollapseRow: function() {
			return !1
		}
	}, o.LOCALES = [], o.LOCALES["en-US"] = {
		formatLoadingMessage: function() {
			return "Loading, please wait..."
		},
		formatRecordsPerPage: function(a) {
			return g("%s records per page", a)
		},
		formatShowingRows: function(a, b, c) {
			return g("Showing %s to %s of %s rows", a, b, c)
		},
		formatSearch: function() {
			return "Search"
		},
		formatNoMatches: function() {
			return "No matching records found"
		},
		formatPaginationSwitch: function() {
			return "Hide/Show pagination"
		},
		formatRefresh: function() {
			return "Refresh"
		},
		formatToggle: function() {
			return "Toggle"
		},
		formatColumns: function() {
			return "Columns"
		},
		formatAllRows: function() {
			return "All"
		}
	}, a.extend(o.DEFAULTS, o.LOCALES["en-US"]), o.COLUMN_DEFAULTS = {
		radio: !1,
		checkbox: !1,
		checkboxEnabled: !0,
		field: void 0,
		title: void 0,
		"class": void 0,
		align: void 0,
		halign: void 0,
		falign: void 0,
		valign: void 0,
		width: void 0,
		sortable: !1,
		order: "asc",
		visible: !0,
		switchable: !0,
		clickToSelect: !0,
		formatter: void 0,
		footerFormatter: void 0,
		events: void 0,
		sorter: void 0,
		sortName: void 0,
		cellStyle: void 0,
		searchable: !0,
		cardVisible: !0
	}, o.EVENTS = {
		"all.bs.table": "onAll",
		"click-cell.bs.table": "onClickCell",
		"dbl-click-cell.bs.table": "onDblClickCell",
		"click-row.bs.table": "onClickRow",
		"dbl-click-row.bs.table": "onDblClickRow",
		"sort.bs.table": "onSort",
		"check.bs.table": "onCheck",
		"uncheck.bs.table": "onUncheck",
		"check-all.bs.table": "onCheckAll",
		"uncheck-all.bs.table": "onUncheckAll",
		"check-some.bs.table": "onCheckSome",
		"uncheck-some.bs.table": "onUncheckSome",
		"load-success.bs.table": "onLoadSuccess",
		"load-error.bs.table": "onLoadError",
		"column-switch.bs.table": "onColumnSwitch",
		"page-change.bs.table": "onPageChange",
		"search.bs.table": "onSearch",
		"toggle.bs.table": "onToggle",
		"pre-body.bs.table": "onPreBody",
		"post-body.bs.table": "onPostBody",
		"post-header.bs.table": "onPostHeader",
		"expand-row.bs.table": "onExpandRow",
		"collapse-row.bs.table": "onCollapseRow"
	}, o.prototype.init = function() {
		this.initContainer(), this.initTable(), this.initHeader(), this.initData(), this.initFooter(), this.initToolbar(), this.initPagination(), this.initBody(), this.initServer()
	}, o.prototype.initContainer = function() {
		this.$container = a(['<div class="bootstrap-table">', '<div class="fixed-table-toolbar"></div>', "top" === this.options.paginationVAlign || "both" === this.options.paginationVAlign ? '<div class="fixed-table-pagination" style="clear: both;"></div>' : "", '<div class="fixed-table-container">', '<div class="fixed-table-header"><table></table></div>', '<div class="fixed-table-body">', '<div class="fixed-table-loading">', this.options.formatLoadingMessage(), "</div>", "</div>", '<div class="fixed-table-footer"><table><tr></tr></table></div>', "bottom" === this.options.paginationVAlign || "both" === this.options.paginationVAlign ? '<div class="fixed-table-pagination"></div>' : "", "</div>", "</div>"].join("")), this.$container.insertAfter(this.$el), this.$tableContainer = this.$container.find(".fixed-table-container"), this.$tableHeader = this.$container.find(".fixed-table-header"), this.$tableBody = this.$container.find(".fixed-table-body"), this.$tableLoading = this.$container.find(".fixed-table-loading"), this.$tableFooter = this.$container.find(".fixed-table-footer"), this.$toolbar = this.$container.find(".fixed-table-toolbar"), this.$pagination = this.$container.find(".fixed-table-pagination"), this.$tableBody.append(this.$el), this.$container.after('<div class="clearfix"></div>'), this.$el.addClass(this.options.classes), this.options.striped && this.$el.addClass("table-striped"), -1 !== a.inArray("table-no-bordered", this.options.classes.split(" ")) && this.$tableContainer.addClass("table-no-bordered")
	}, o.prototype.initTable = function() {
		var b = this,
			c = [],
			d = [];
		this.$header = this.$el.find("thead"), this.$header.length || (this.$header = a("<thead></thead>").appendTo(this.$el)), this.$header.find("tr").length || this.$header.append("<tr></tr>"), this.$header.find("th").each(function() {
			var b = a.extend({}, {
				title: a(this).html(),
				"class": a(this).attr("class")
			}, a(this).data());
			c.push(b)
		}), this.options.columns = a.extend(!0, [], c, this.options.columns), a.each(this.options.columns, function(c, d) {
			b.options.columns[c] = a.extend({}, o.COLUMN_DEFAULTS, {
				field: c
			}, d)
		}), this.options.data.length || (this.$el.find("tbody tr").each(function() {
			var c = {};
			c._id = a(this).attr("id"), c._class = a(this).attr("class"), c._data = n(a(this).data()), a(this).find("td").each(function(d) {
				var e = b.options.columns[d].field;
				c[e] = a(this).html(), c["_" + e + "_id"] = a(this).attr("id"), c["_" + e + "_class"] = a(this).attr("class"), c["_" + e + "_rowspan"] = a(this).attr("rowspan"), c["_" + e + "_data"] = n(a(this).data())
			}), d.push(c)
		}), this.options.data = d)
	}, o.prototype.initHeader = function() {
		var c = this,
			d = [],
			e = [];
		this.header = {
			fields: [],
			styles: [],
			classes: [],
			formatters: [],
			events: [],
			sorters: [],
			sortNames: [],
			cellStyles: [],
			clickToSelects: [],
			searchables: []
		}, !this.options.cardView && this.options.detailView && (e.push('<th class="detail"><div class="fht-cell"></div></th>'), d.push({})), a.each(this.options.columns, function(a, b) {
			var f = "",
				h = "",
				i = "",
				j = "",
				k = g(' class="%s"', b["class"]),
				l = (c.options.sortOrder || b.order, "px"),
				m = b.width;
			return b.visible ? void((!c.options.cardView || b.cardVisible) && (void 0 === b.width || c.options.cardView || "string" == typeof b.width && -1 !== b.width.indexOf("%") && (l = "%"), b.width && "string" == typeof b.width && (m = b.width.replace("%", "").replace("px", "")), h = g("text-align: %s; ", b.halign ? b.halign : b.align), i = g("text-align: %s; ", b.align), j = g("vertical-align: %s; ", b.valign), j += g("width: %s%s; ", b.checkbox || b.radio ? 36 : m, l), d.push(b), c.header.fields.push(b.field), c.header.styles.push(i + j), c.header.classes.push(k), c.header.formatters.push(b.formatter), c.header.events.push(b.events), c.header.sorters.push(b.sorter), c.header.sortNames.push(b.sortName), c.header.cellStyles.push(b.cellStyle), c.header.clickToSelects.push(b.clickToSelect), c.header.searchables.push(b.searchable), e.push("<th", b.checkbox || b.radio ? g(' class="bs-checkbox %s"', b["class"] || "") : k, g(' style="%s"', h + j), ">"), e.push(g('<div class="th-inner %s">', c.options.sortable && b.sortable ? "sortable" : "")), f = b.title, b.checkbox && (!c.options.singleSelect && c.options.checkboxHeader && (f = '<input name="btSelectAll" type="checkbox" />'), c.header.stateField = b.field), b.radio && (f = "", c.header.stateField = b.field, c.options.singleSelect = !0), e.push(f), e.push("</div>"), e.push('<div class="fht-cell"></div>'), e.push("</div>"), e.push("</th>"))) : void(b.field === c.options.sortName && c.header.fields.push(b.field))
		}), this.$header.find("tr").html(e.join("")), this.$header.find("th").each(function(b) {
			a(this).data(d[b])
		}), this.$container.off("click", ".th-inner").on("click", ".th-inner", function(b) {
			c.options.sortable && a(this).parent().data().sortable && c.onSort(b)
		}), !this.options.showHeader || this.options.cardView ? (this.$header.hide(), this.$tableHeader.hide(), this.$tableLoading.css("top", 0)) : (this.$header.show(), this.$tableHeader.show(), this.$tableLoading.css("top", b + "px"), this.getCaretHtml()), this.$selectAll = this.$header.find('[name="btSelectAll"]'), this.$container.off("click", '[name="btSelectAll"]').on("click", '[name="btSelectAll"]', function() {
			var b = a(this).prop("checked");
			c[b ? "checkAll" : "uncheckAll"]()
		})
	}, o.prototype.initFooter = function() {
		!this.options.showFooter || this.options.cardView ? this.$tableFooter.hide() : this.$tableFooter.show()
	}, o.prototype.initData = function(a, b) {
		this.data = "append" === b ? this.data.concat(a) : "prepend" === b ? [].concat(a).concat(this.data) : a || this.options.data, this.options.data = "append" === b ? this.options.data.concat(a) : "prepend" === b ? [].concat(a).concat(this.options.data) : this.data, "server" !== this.options.sidePagination && this.initSort()
	}, o.prototype.initSort = function() {
		var b = this,
			c = this.options.sortName,
			d = "desc" === this.options.sortOrder ? -1 : 1,
			e = a.inArray(this.options.sortName, this.header.fields); - 1 !== e && this.data.sort(function(f, g) {
			b.header.sortNames[e] && (c = b.header.sortNames[e]);
			var h = f[c],
				i = g[c],
				j = k(b.header, b.header.sorters[e], [h, i]);
			return void 0 !== j ? d * j : ((void 0 === h || null === h) && (h = ""), (void 0 === i || null === i) && (i = ""), a.isNumeric(h) && a.isNumeric(i) ? (h = parseFloat(h), i = parseFloat(i), i > h ? -1 * d : d) : h === i ? 0 : ("string" != typeof h && (h = h.toString()), -1 === h.localeCompare(i) ? -1 * d : d))
		})
	}, o.prototype.onSort = function(b) {
		var c = a(b.currentTarget).parent(),
			d = this.$header.find("th").eq(c.index()),
			e = c.data("sortName") ? c.data("sortName") : c.data("field");
		return this.$header.add(this.$header_).find("span.order").remove(), this.options.sortName === e ? this.options.sortOrder = "asc" === this.options.sortOrder ? "desc" : "asc" : (this.options.sortName = e, this.options.sortOrder = "asc" === c.data("order") ? "desc" : "asc"), this.trigger("sort", this.options.sortName, this.options.sortOrder), c.add(d).data("order", this.options.sortOrder), this.getCaretHtml(), "server" === this.options.sidePagination ? void this.initServer() : (this.initSort(), void this.initBody())
	}, o.prototype.initToolbar = function() {
		var b, c, d = this,
			e = [],
			f = 0,
			h = 0;
		this.$toolbar.html(""), "string" == typeof this.options.toolbar && a(g('<div class="bars pull-%s"></div>', this.options.toolbarAlign)).appendTo(this.$toolbar).append(a(this.options.toolbar)), e = [g('<div class="columns columns-%s btn-group pull-%s">', this.options.buttonsAlign, this.options.buttonsAlign)], "string" == typeof this.options.icons && (this.options.icons = k(null, this.options.icons)), this.options.showPaginationSwitch && e.push(g('<button class="btn btn-default" type="button" name="paginationSwitch" title="%s">', this.options.formatPaginationSwitch()), g('<i class="%s %s"></i>', this.options.iconsPrefix, this.options.icons.paginationSwitchDown), "</button>"), this.options.showRefresh && e.push(g('<button class="btn btn-default' + (void 0 === this.options.iconSize ? "" : " btn-" + this.options.iconSize) + '" type="button" name="refresh" title="%s">', this.options.formatRefresh()), g('<i class="%s %s"></i>', this.options.iconsPrefix, this.options.icons.refresh), "</button>"), this.options.showToggle && e.push(g('<button class="btn btn-default' + (void 0 === this.options.iconSize ? "" : " btn-" + this.options.iconSize) + '" type="button" name="toggle" title="%s">', this.options.formatToggle()), g('<i class="%s %s"></i>', this.options.iconsPrefix, this.options.icons.toggle), "</button>"), this.options.showColumns && (e.push(g('<div class="keep-open btn-group" title="%s">', this.options.formatColumns()), '<button type="button" class="btn btn-default' + (void 0 == this.options.iconSize ? "" : " btn-" + this.options.iconSize) + ' dropdown-toggle" data-toggle="dropdown">', g('<i class="%s %s"></i>', this.options.iconsPrefix, this.options.icons.columns), ' <span class="caret"></span>', "</button>", '<ul class="dropdown-menu" role="menu">'), a.each(this.options.columns, function(a, b) {
			if (!(b.radio || b.checkbox || d.options.cardView && !b.cardVisible)) {
				var c = b.visible ? ' checked="checked"' : "";
				b.switchable && (e.push(g('<li><label><input type="checkbox" data-field="%s" value="%s"%s> %s</label></li>', b.field, a, c, b.title)), h++)
			}
		}), e.push("</ul>", "</div>")), e.push("</div>"), (this.showToolbar || e.length > 2) && this.$toolbar.append(e.join("")), this.options.showPaginationSwitch && this.$toolbar.find('button[name="paginationSwitch"]').off("click").on("click", a.proxy(this.togglePagination, this)), this.options.showRefresh && this.$toolbar.find('button[name="refresh"]').off("click").on("click", a.proxy(this.refresh, this)), this.options.showToggle && this.$toolbar.find('button[name="toggle"]').off("click").on("click", function() {
			d.toggleView()
		}), this.options.showColumns && (b = this.$toolbar.find(".keep-open"), h <= this.options.minimumCountColumns && b.find("input").prop("disabled", !0), b.find("li").off("click").on("click", function(a) {
			a.stopImmediatePropagation()
		}), b.find("input").off("click").on("click", function() {
			var b = a(this);
			d.toggleColumn(i(d.options.columns, a(this).data("field")), b.prop("checked"), !1), d.trigger("column-switch", a(this).data("field"), b.prop("checked"))
		})), this.options.search && (e = [], e.push('<div class="pull-' + this.options.searchAlign + ' search">', g('<input class="form-control' + (void 0 === this.options.iconSize ? "" : " input-" + this.options.iconSize) + '" type="text" placeholder="%s">', this.options.formatSearch()), "</div>"), this.$toolbar.append(e.join("")), c = this.$toolbar.find(".search input"), c.off("keyup drop").on("keyup drop", function(a) {
			clearTimeout(f), f = setTimeout(function() {
				d.onSearch(a)
			}, d.options.searchTimeOut)
		}), "" !== this.options.searchText && (c.val(this.options.searchText), clearTimeout(f), f = setTimeout(function() {
			c.trigger("keyup")
		}, d.options.searchTimeOut)))
	}, o.prototype.onSearch = function(b) {
		var c = a.trim(a(b.currentTarget).val());
		this.options.trimOnSearch && a(b.currentTarget).val() !== c && a(b.currentTarget).val(c), 
		c !== this.searchText && 
		(this.searchText = c, this.options.pageNumber = 1, this.initSearch(), 
				this.updatePagination(), this.trigger("search", c))
	}, o.prototype.initSearch = function() {
		var b = this;
		if ("server" !== this.options.sidePagination) {
			var c = this.searchText && this.searchText.toLowerCase(),
				d = a.isEmptyObject(this.filterColumns) ? null : this.filterColumns;
			this.data = d ? a.grep(this.options.data, function(a) {
				for (var b in d) if (a[b] !== d[b]) return !1;
				return !0
			}) : this.options.data, this.data = c ? a.grep(this.data, function(d, e) {
				for (var f in d) {
					f = a.isNumeric(f) ? parseInt(f, 10) : f;
					var g = d[f],
						h = b.options.columns[i(b.options.columns, f)],
						j = a.inArray(f, b.header.fields);
					g = k(h, b.header.formatters[j], [g, d, e], g);
					var l = a.inArray(f, b.header.fields);
					if (-1 !== l && b.header.searchables[l] && ("string" == typeof g || "number" == typeof g) && -1 !== (g + "").toLowerCase().indexOf(c)) return !0
				}
				return !1
			}) : this.data
		}
	}, o.prototype.initPagination = function() {
		if (!this.options.pagination) return void this.$pagination.hide();
		this.$pagination.show();
		var b, c, d, e, f, h, i, j, k, l = this,
			m = [],
			n = !1,
			o = this.getData();
		if ("server" !== this.options.sidePagination && (this.options.totalRows = o.length), this.totalPages = 0, this.options.totalRows) {
			if (this.options.pageSize === this.options.formatAllRows()) this.options.pageSize = this.options.totalRows, n = !0;
			else if (this.options.pageSize === this.options.totalRows) {
				var p = "string" == typeof this.options.pageList ? this.options.pageList.replace("[", "").replace("]", "").replace(/ /g, "").toLowerCase().split(",") : this.options.pageList;
				p.indexOf(this.options.formatAllRows().toLowerCase()) > -1 && (n = !0)
			}
			this.totalPages = ~~ ((this.options.totalRows - 1) / this.options.pageSize) + 1, this.options.totalPages = this.totalPages
		}
		this.totalPages > 0 && this.options.pageNumber > this.totalPages && (this.options.pageNumber = this.totalPages), this.pageFrom = (this.options.pageNumber - 1) * this.options.pageSize + 1, this.pageTo = this.options.pageNumber * this.options.pageSize, this.pageTo > this.options.totalRows && (this.pageTo = this.options.totalRows), m.push('<div class="pull-' + this.options.paginationDetailHAlign + ' pagination-detail">', '<span class="pagination-info">', this.options.formatShowingRows(this.pageFrom, this.pageTo, this.options.totalRows), "</span>"), m.push('<span class="page-list">');
		var q = [g('<span class="btn-group %s">', "top" === this.options.paginationVAlign || "both" === this.options.paginationVAlign ? "dropdown" : "dropup"), '<button type="button" class="btn btn-default ' + (void 0 === this.options.iconSize ? "" : " btn-" + this.options.iconSize) + ' dropdown-toggle" data-toggle="dropdown">', '<span class="page-size">', n ? this.options.formatAllRows() : this.options.pageSize, "</span>", ' <span class="caret"></span>', "</button>", '<ul class="dropdown-menu" role="menu">'],
			r = this.options.pageList;
		if ("string" == typeof this.options.pageList) {
			var s = this.options.pageList.replace("[", "").replace("]", "").replace(/ /g, "").split(",");
			r = [], a.each(s, function(a, b) {
				r.push(b.toUpperCase() === l.options.formatAllRows().toUpperCase() ? l.options.formatAllRows() : +b)
			})
		}
		for (a.each(r, function(a, b) {
			if (!l.options.smartDisplay || 0 === a || r[a - 1] <= l.options.totalRows) {
				var c;
				c = n ? b === l.options.formatAllRows() ? ' class="active"' : "" : b === l.options.pageSize ? ' class="active"' : "", q.push(g('<li%s><a href="javascript:void(0)">%s</a></li>', c, b))
			}
		}), q.push("</ul></span>"), m.push(this.options.formatRecordsPerPage(q.join(""))), m.push("</span>"), m.push("</div>", '<div class="pull-' + this.options.paginationHAlign + ' pagination">', '<ul class="pagination' + (void 0 === this.options.iconSize ? "" : " pagination-" + this.options.iconSize) + '">', '<li class="page-first"><a href="javascript:void(0)">' + this.options.paginationFirstText + "</a></li>", '<li class="page-pre"><a href="javascript:void(0)">' + this.options.paginationPreText + "</a></li>"), this.totalPages < 5 ? (c = 1, d = this.totalPages) : (c = this.options.pageNumber - 2, d = c + 4, 1 > c && (c = 1, d = 5), d > this.totalPages && (d = this.totalPages, c = d - 4)), b = c; d >= b; b++) m.push('<li class="page-number' + (b === this.options.pageNumber ? " active" : "") + '">', '<a href="javascript:void(0)">', b, "</a>", "</li>");
		m.push('<li class="page-next"><a href="javascript:void(0)">' + this.options.paginationNextText + "</a></li>", '<li class="page-last"><a href="javascript:void(0)">' + this.options.paginationLastText + "</a></li>", "</ul>", "</div>"), this.$pagination.html(m.join("")), e = this.$pagination.find(".page-list a"), f = this.$pagination.find(".page-first"), h = this.$pagination.find(".page-pre"), i = this.$pagination.find(".page-next"), j = this.$pagination.find(".page-last"), k = this.$pagination.find(".page-number"), this.options.pageNumber <= 1 && (f.addClass("disabled"), h.addClass("disabled")), this.options.pageNumber >= this.totalPages && (i.addClass("disabled"), j.addClass("disabled")), this.options.smartDisplay && (this.totalPages <= 1 && this.$pagination.find("div.pagination").hide(), (r.length < 2 || this.options.totalRows <= r[0]) && this.$pagination.find("span.page-list").hide(), this.$pagination[this.getData().length ? "show" : "hide"]()), n && (this.options.pageSize = this.options.formatAllRows()), e.off("click").on("click", a.proxy(this.onPageListChange, this)), f.off("click").on("click", a.proxy(this.onPageFirst, this)), h.off("click").on("click", a.proxy(this.onPagePre, this)), i.off("click").on("click", a.proxy(this.onPageNext, this)), j.off("click").on("click", a.proxy(this.onPageLast, this)), k.off("click").on("click", a.proxy(this.onPageNumber, this))
	}, o.prototype.updatePagination = function(b) {
		b && a(b.currentTarget).hasClass("disabled") || (this.options.maintainSelected || this.resetRows(), this.initPagination(), "server" === this.options.sidePagination ? this.initServer() : this.initBody(), this.trigger("page-change", this.options.pageNumber, this.options.pageSize))
	}, o.prototype.onPageListChange = function(b) {
		var c = a(b.currentTarget);
		c.parent().addClass("active").siblings().removeClass("active"), this.options.pageSize = c.text().toUpperCase() === this.options.formatAllRows().toUpperCase() ? this.options.formatAllRows() : +c.text(), this.$toolbar.find(".page-size").text(this.options.pageSize), this.updatePagination(b)
	}, o.prototype.onPageFirst = function(a) {
		this.options.pageNumber = 1, this.updatePagination(a)
	}, o.prototype.onPagePre = function(a) {
		this.options.pageNumber--, this.updatePagination(a)
	}, o.prototype.onPageNext = function(a) {
		this.options.pageNumber++, this.updatePagination(a)
	}, o.prototype.onPageLast = function(a) {
		this.options.pageNumber = this.totalPages, this.updatePagination(a)
	}, o.prototype.onPageNumber = function(b) {
		this.options.pageNumber !== +a(b.currentTarget).text() && (this.options.pageNumber = +a(b.currentTarget).text(), this.updatePagination(b))
	}, o.prototype.initBody = function(b) {
		var c = this,
			d = [],
			e = this.getData();
		this.trigger("pre-body", e), this.$body = this.$el.find("tbody"), this.$body.length || (this.$body = a("<tbody></tbody>").appendTo(this.$el)), this.options.pagination && "server" !== this.options.sidePagination || (this.pageFrom = 1, this.pageTo = e.length);
		for (var f = this.pageFrom - 1; f < this.pageTo; f++) {
			var j, m = e[f],
				n = {},
				o = [],
				p = "",
				q = {},
				r = [];
			if (n = k(this.options, this.options.rowStyle, [m, f], n), n && n.css) for (j in n.css) o.push(j + ": " + n.css[j]);
			if (q = k(this.options, this.options.rowAttributes, [m, f], q)) for (j in q) r.push(g('%s="%s"', j, l(q[j])));
			m._data && !a.isEmptyObject(m._data) && a.each(m._data, function(a, b) {
				"index" !== a && (p += g(' data-%s="%s"', a, b))
			}), d.push("<tr", g(" %s", r.join(" ")), g(' id="%s"', a.isArray(m) ? void 0 : m._id), g(' class="%s"', n.classes || (a.isArray(m) ? void 0 : m._class)), g(' data-index="%s"', f), g(' data-uniqueid="%s"', m[this.options.uniqueId]), g("%s", p), ">"), this.options.cardView && d.push(g('<td colspan="%s">', this.header.fields.length)), !this.options.cardView && this.options.detailView && d.push("<td>", '<a class="detail-icon" href="javascript:">', '<i class="glyphicon glyphicon-plus icon-plus"></i>', "</a>", "</td>"), a.each(this.header.fields, function(b, e) {
				var j = "",
					l = m[e],
					p = "",
					q = {},
					r = "",
					s = c.header.classes[b],
					t = "",
					u = "",
					v = c.options.columns[i(c.options.columns, e)];
				if (n = g('style="%s"', o.concat(c.header.styles[b]).join("; ")), l = k(v, c.header.formatters[b], [l, m, f], l), m["_" + e + "_id"] && (r = g(' id="%s"', m["_" + e + "_id"])), m["_" + e + "_class"] && (s = g(' class="%s"', m["_" + e + "_class"])), m["_" + e + "_rowspan"] && (u = g(' rowspan="%s"', m["_" + e + "_rowspan"])), q = k(c.header, c.header.cellStyles[b], [l, m, f], q), q.classes && (s = g(' class="%s"', q.classes)), q.css) {
					var w = [];
					for (var x in q.css) w.push(x + ": " + q.css[x]);
					n = g('style="%s"', w.concat(c.header.styles[b]).join("; "))
				}
				m["_" + e + "_data"] && !a.isEmptyObject(m["_" + e + "_data"]) && a.each(m["_" + e + "_data"], function(a, b) {
					"index" !== a && (t += g(' data-%s="%s"', a, b))
				}), v.checkbox || v.radio ? (p = v.checkbox ? "checkbox" : p, p = v.radio ? "radio" : p, j = [c.options.cardView ? '<div class="card-view">' : '<td class="bs-checkbox">', "<input" + g(' data-index="%s"', f) + g(' name="%s"', c.options.selectItemName) + g(' type="%s"', p) + g(' value="%s"', m[c.options.idField]) + g(' checked="%s"', l === !0 || l && l.checked ? "checked" : void 0) + g(' disabled="%s"', !v.checkboxEnabled || l && l.disabled ? "disabled" : void 0) + " />", c.options.cardView ? "</div>" : "</td>"].join(""), m[c.header.stateField] = l === !0 || l && l.checked) : (l = "undefined" == typeof l || null === l ? c.options.undefinedText : l, j = c.options.cardView ? ['<div class="card-view">', c.options.showHeader ? g('<span class="title" %s>%s</span>', n, h(c.options.columns, "field", "title", e)) : "", g('<span class="value">%s</span>', l), "</div>"].join("") : [g("<td%s %s %s %s %s>", r, s, n, t, u), l, "</td>"].join(""), c.options.cardView && c.options.smartDisplay && "" === l && (j = "")), d.push(j)
			}), this.options.cardView && d.push("</td>"), d.push("</tr>")
		}
		d.length || d.push('<tr class="no-records-found">', g('<td colspan="%s">%s</td>', this.$header.find("th").length, this.options.formatNoMatches()), "</tr>"), this.$body.html(d.join("")), b || this.scrollTo(0), this.$body.find("> tr > td").off("click").on("click", function() {
			var b = a(this),
				d = b.parent(),
				e = c.data[d.data("index")],
				f = b[0].cellIndex,
				h = c.$header.find("th:eq(" + f + ")"),
				i = h.data("field"),
				j = e[i];
			c.trigger("click-cell", i, j, e, b), c.trigger("click-row", e, d), c.options.clickToSelect && c.header.clickToSelects[d.children().index(a(this))] && d.find(g('[name="%s"]', c.options.selectItemName))[0].click()
		}), this.$body.find("> tr > td").off("dblclick").on("dblclick", function() {
			var b = a(this),
				d = b.parent(),
				e = c.data[d.data("index")],
				f = b[0].cellIndex,
				g = c.$header.find("th:eq(" + f + ")"),
				h = g.data("field"),
				i = e[h];
			c.trigger("dbl-click-cell", h, i, e, b), c.trigger("dbl-click-row", e, d)
		}), this.$body.find("> tr > td > .detail-icon").off("click").on("click", function() {
			var b = a(this),
				d = b.parent().parent(),
				e = d.data("index"),
				f = c.options.data[e];
			d.next().is("tr.detail-view") ? (b.find("i").attr("class", "glyphicon glyphicon-plus icon-plus"), d.next().remove(), c.trigger("collapse-row", e, f)) : (b.find("i").attr("class", "glyphicon glyphicon-minus icon-minus"), d.after(g('<tr class="detail-view"><td colspan="%s">%s</td></tr>', d.find("td").length, k(c.options, c.options.detailFormatter, [e, f], ""))), c.trigger("expand-row", e, f, d.next().find("td"))), c.resetView()
		}), this.$selectItem = this.$body.find(g('[name="%s"]', this.options.selectItemName)), this.$selectItem.off("click").on("click", function(b) {
			b.stopImmediatePropagation();
			var d = a(this).prop("checked"),
				e = c.data[a(this).data("index")];
			e[c.header.stateField] = d, c.options.singleSelect && (c.$selectItem.not(this).each(function() {
				c.data[a(this).data("index")][c.header.stateField] = !1
			}), c.$selectItem.filter(":checked").not(this).prop("checked", !1)), c.updateSelected(), c.trigger(d ? "check" : "uncheck", e)
		}), a.each(this.header.events, function(b, d) {
			if (d) {
				"string" == typeof d && (d = k(null, d)), !c.options.cardView && c.options.detailView && (b += 1);
				for (var e in d) c.$body.find("tr").each(function() {
					var f = a(this),
						g = f.find(c.options.cardView ? ".card-view" : "td").eq(b),
						h = e.indexOf(" "),
						i = e.substring(0, h),
						j = e.substring(h + 1),
						k = d[e];
					g.find(j).off(i).on(i, function(a) {
						var d = f.data("index"),
							e = c.data[d],
							g = e[c.header.fields[b]];
						k.apply(this, [a, g, e, d])
					})
				})
			}
		}), this.updateSelected(), this.resetView(), this.trigger("post-body")
	}, o.prototype.initServer = function(b, c) {
		var d, e = this,
			f = {},
			g = {
				pageSize: this.options.pageSize === this.options.formatAllRows() ? this.options.totalRows : this.options.pageSize,
				pageNumber: this.options.pageNumber,
				searchText: this.searchText,
				sortName: this.options.sortName,
				sortOrder: this.options.sortOrder
			};
		(this.options.url || this.options.ajax) && ("limit" === this.options.queryParamsType && (g = {
			search: g.searchText,
			sort: g.sortName,
			order: g.sortOrder
		}, this.options.pagination && (g.limit = this.options.pageSize === this.options.formatAllRows() ? this.options.totalRows : this.options.pageSize, g.offset = this.options.pageSize === this.options.formatAllRows() ? 0 : this.options.pageSize * (this.options.pageNumber - 1))), a.isEmptyObject(this.filterColumnsPartial) || (g.filter = JSON.stringify(this.filterColumnsPartial, null)), f = k(this.options, this.options.queryParams, [g], f), a.extend(f, c || {}), f !== !1 && (b || this.$tableLoading.show(), d = a.extend({}, k(null, this.options.ajaxOptions), {
			type: this.options.method,
			url: this.options.url,
			data: "application/json" === this.options.contentType && "post" === this.options.method ? JSON.stringify(f) : f,
			cache: this.options.cache,
			contentType: this.options.contentType,
			dataType: this.options.dataType,
			success: function(a) {
				a = k(e.options, e.options.responseHandler, [a], a), e.load(a), e.trigger("load-success", a)
			},
			error: function(a) {
				e.trigger("load-error", a.status)
			},
			complete: function() {
				b || e.$tableLoading.hide()
			}
		}), this.options.ajax ? k(this, this.options.ajax, [d], null) : a.ajax(d)))
	}, o.prototype.getCaretHtml = function() {
		var b = this;
		a.each(this.$header.find("th"), function(c, g) {
			var $sortName = a(g).data("sortName") ? a(g).data("sortName") : a(g).data("field");
			$sortName === b.options.sortName ? a(g).find(".sortable").css("background-image", "url(" + ("desc" === b.options.sortOrder ? f : d) + ")") : a(g).find(".sortable").css("background-image", "url(" + e + ")")
		})
	}, o.prototype.updateSelected = function() {
		var b = this.$selectItem.filter(":enabled").length === this.$selectItem.filter(":enabled").filter(":checked").length;
		this.$selectAll.add(this.$selectAll_).prop("checked", b), this.$selectItem.each(function() {
			a(this).parents("tr")[a(this).prop("checked") ? "addClass" : "removeClass"]("selected")
		})
	}, o.prototype.updateRows = function() {
		var b = this;
		this.$selectItem.each(function() {
			b.data[a(this).data("index")][b.header.stateField] = a(this).prop("checked")
		})
	}, o.prototype.resetRows = function() {
		var b = this;
		a.each(this.data, function(a, c) {
			b.$selectAll.prop("checked", !1), b.$selectItem.prop("checked", !1), c[b.header.stateField] = !1
		})
	}, o.prototype.trigger = function(b) {
		var c = Array.prototype.slice.call(arguments, 1);
		b += ".bs.table", this.options[o.EVENTS[b]].apply(this.options, c), this.$el.trigger(a.Event(b), c), this.options.onAll(b, c), this.$el.trigger(a.Event("all.bs.table"), [b, c])
	}, o.prototype.resetHeader = function() {
		clearTimeout(this.timeoutId_), this.timeoutId_ = setTimeout(a.proxy(this.fitHeader, this), this.$el.is(":hidden") ? 100 : 0)
	}, o.prototype.fitHeader = function() {
		var b, c, d = this;
		return d.$el.is(":hidden") ? void(d.timeoutFooter_ = setTimeout(a.proxy(d.fitHeader, d), 100)) : (b = this.$tableBody.get(0), c = b.scrollWidth > b.clientWidth && b.scrollHeight > b.clientHeight + this.$header.height() ? j() : 0, this.$el.css("margin-top", -this.$header.height()), this.$header_ = this.$header.clone(!0, !0), this.$selectAll_ = this.$header_.find('[name="btSelectAll"]'), this.$tableHeader.css({
			"margin-right": c
		}).find("table").css("width", this.$el.css("width")).html("").attr("class", this.$el.attr("class")).append(this.$header_), this.$header.find("th").each(function(b) {
			d.$header_.find("th").eq(b).data(a(this).data())
		}), this.$body.find("tr:first-child:not(.no-records-found) > *").each(function(b) {
			d.$header_.find("div.fht-cell").eq(b).width(a(this).innerWidth())
		}), this.$tableBody.off("scroll").on("scroll", function() {
			d.$tableHeader.scrollLeft(a(this).scrollLeft())
		}), void d.trigger("post-header"))
	}, o.prototype.resetFooter = function() {
		var b = this,
			c = b.getData(),
			d = [];
		this.options.showFooter && !this.options.cardView && (!this.options.cardView && this.options.detailView && d.push("<td></td>"), a.each(this.options.columns, function(a, e) {
			var f = "",
				h = "",
				i = g(' class="%s"', e["class"]);
			e.visible && (!b.options.cardView || e.cardVisible) && (f = g("text-align: %s; ", e.falign ? e.falign : e.align), h = g("vertical-align: %s; ", e.valign), d.push("<td", i, g(' style="%s"', f + h), ">"), d.push(k(e, e.footerFormatter, [c], "&nbsp;") || "&nbsp;"), d.push("</td>"))
		}), this.$tableFooter.find("tr").html(d.join("")), clearTimeout(this.timeoutFooter_), this.timeoutFooter_ = setTimeout(a.proxy(this.fitFooter, this), this.$el.is(":hidden") ? 100 : 0))
	}, o.prototype.fitFooter = function() {
		var b, c, d;
		return clearTimeout(this.timeoutFooter_), this.$el.is(":hidden") ? void(this.timeoutFooter_ = setTimeout(a.proxy(this.fitFooter, this), 100)) : (c = this.$el.css("width"), d = c > this.$tableBody.width() ? j() : 0, this.$tableFooter.css({
			"margin-right": d
		}).find("table").css("width", c).attr("class", this.$el.attr("class")), b = this.$tableFooter.find("td"), void this.$tableBody.find("tbody tr:first-child:not(.no-records-found) > td").each(function(c) {
			b.eq(c).outerWidth(a(this).outerWidth())
		}))
	}, o.prototype.toggleColumn = function(a, b, c) {
		if (-1 !== a && (this.options.columns[a].visible = b, this.initHeader(), this.initSearch(), this.initPagination(), this.initBody(), this.options.showColumns)) {
			var d = this.$toolbar.find(".keep-open input").prop("disabled", !1);
			c && d.filter(g('[value="%s"]', a)).prop("checked", b), d.filter(":checked").length <= this.options.minimumCountColumns && d.filter(":checked").prop("disabled", !0)
		}
	}, o.prototype.toggleRow = function(b, c, d) {
		-1 !== b && a(this.$body[0]).children().filter(g(c ? '[data-uniqueid="%s"]' : '[data-index="%s"]', b))[d ? "show" : "hide"]()
	}, o.prototype.resetView = function(a) {
		var c = 0;
		if (a && a.height && (this.options.height = a.height), this.$selectAll.prop("checked", this.$selectItem.length > 0 && this.$selectItem.length === this.$selectItem.filter(":checked").length), this.options.height) {
			var d = m(this.$toolbar),
				e = m(this.$pagination),
				f = this.options.height - d - e;
			this.$tableContainer.css("height", f + "px")
		}
		return this.options.cardView ? (this.$el.css("margin-top", "0"), void this.$tableContainer.css("padding-bottom", "0")) : (this.options.showHeader && this.options.height ? (this.$tableHeader.show(), this.resetHeader(), c += b) : (this.$tableHeader.hide(), this.trigger("post-header")), this.options.showFooter && (this.resetFooter(), this.options.height && (c += b)), this.getCaretHtml(), void this.$tableContainer.css("padding-bottom", c + "px"))
	}, o.prototype.getData = function(b) {
		return !this.searchText && a.isEmptyObject(this.filterColumns) && a.isEmptyObject(this.filterColumnsPartial) ? b ? this.options.data.slice(this.pageFrom - 1, this.pageTo) : this.options.data : b ? this.data.slice(this.pageFrom - 1, this.pageTo) : this.data
	}, o.prototype.load = function(b) {
		var c = !1;
		"server" === this.options.sidePagination ? (this.options.totalRows = b.total, c = b.fixedScroll, b = b.rows) : a.isArray(b) || (c = b.fixedScroll, b = b.data), this.initData(b), this.initSearch(), this.initPagination(), this.initBody(c)
	}, o.prototype.append = function(a) {
		this.initData(a, "append"), this.initSearch(), this.initPagination(), this.initBody(!0)
	}, o.prototype.prepend = function(a) {
		this.initData(a, "prepend"), this.initSearch(), this.initPagination(), this.initBody(!0)
	}, o.prototype.remove = function(b) {
		var c, d, e = this.options.data.length;
		if (b.hasOwnProperty("field") && b.hasOwnProperty("values")) {
			for (c = e - 1; c >= 0; c--) d = this.options.data[c], d.hasOwnProperty(b.field) && -1 !== a.inArray(d[b.field], b.values) && this.options.data.splice(c, 1);
			e !== this.options.data.length && (this.initSearch(), this.initPagination(), this.initBody(!0))
		}
	}, o.prototype.removeAll = function() {
		this.options.data.length > 0 && (this.options.data.splice(0, this.options.data.length), this.initSearch(), this.initPagination(), this.initBody(!0))
	}, o.prototype.removeByUniqueId = function(a) {
		var b, c, d = this.options.uniqueId,
			e = this.options.data.length;
		for (b = e - 1; b >= 0; b--) c = this.options.data[b], c.hasOwnProperty(d) && ("string" == typeof c[d] ? a = a.toString() : "number" == typeof c[d] && (Number(c[d]) === c[d] && c[d] % 1 === 0 ? a = parseInt(a) : c[d] === Number(c[d]) && 0 !== c[d] && (a = parseFloat(a))), c[d] === a && this.options.data.splice(b, 1));
		e !== this.options.data.length && (this.initSearch(), this.initPagination(), this.initBody(!0))
	}, o.prototype.insertRow = function(a) {
		a.hasOwnProperty("index") && a.hasOwnProperty("row") && (this.data.splice(a.index, 0, a.row), this.initSearch(), this.initPagination(), this.initSort(), this.initBody(!0))
	}, o.prototype.updateRow = function(b) {
		b.hasOwnProperty("index") && b.hasOwnProperty("row") && (a.extend(this.data[b.index], b.row), this.initSort(), this.initBody(!0))
	}, o.prototype.showRow = function(a) {
		a.hasOwnProperty("index") && this.toggleRow(a.index, void 0 === a.isIdField ? !1 : !0, !0)
	}, o.prototype.hideRow = function(a) {
		a.hasOwnProperty("index") && this.toggleRow(a.index, void 0 === a.isIdField ? !1 : !0, !1)
	}, o.prototype.getRowsHidden = function(b) {
		var c = a(this.$body[0]).children().filter(":hidden"),
			d = 0;
		if (b) for (; d < c.length; d++) a(c[d]).show();
		return c
	}, o.prototype.mergeCells = function(b) {
		var c, d, e = b.index,
			f = a.inArray(b.field, this.header.fields),
			g = b.rowspan || 1,
			h = b.colspan || 1,
			i = this.$body.find("tr"),
			j = i.eq(e).find("td").eq(f);
		if (!this.options.cardView && this.options.detailView && (f += 1), j = i.eq(e).find("td").eq(f), !(0 > e || 0 > f || e >= this.data.length)) {
			for (c = e; e + g > c; c++) for (d = f; f + h > d; d++) i.eq(c).find("td").eq(d).hide();
			j.attr("rowspan", g).attr("colspan", h).show()
		}
	}, o.prototype.updateCell = function(a) {
		a.hasOwnProperty("rowIndex") && a.hasOwnProperty("fieldName") && a.hasOwnProperty("fieldValue") && (this.data[a.rowIndex][a.fieldName] = a.fieldValue, this.initSort(), this.initBody(!0))
	}, o.prototype.getOptions = function() {
		return this.options
	}, o.prototype.beforeSearch = function() {
		this.$pagination.find(".page-number").first().addClass("active").siblings().removeClass("active");
		this.options.pageNumber = 1;
	}, o.prototype.getSelections = function() {
		var b = this;
		return a.grep(this.data, function(a) {
			return a[b.header.stateField]
		})
	}, o.prototype.getAllSelections = function() {
		var b = this;
		return a.grep(this.options.data, function(a) {
			return a[b.header.stateField]
		})
	}, o.prototype.checkAll = function() {
		this.checkAll_(!0)
	}, o.prototype.uncheckAll = function() {
		this.checkAll_(!1)
	}, o.prototype.checkAll_ = function(a) {
		var b;
		a || (b = this.getSelections()), this.$selectItem.filter(":enabled").prop("checked", a), this.updateRows(), this.updateSelected(), a && (b = this.getSelections()), this.trigger(a ? "check-all" : "uncheck-all", b)
	}, o.prototype.check = function(a) {
		this.check_(!0, a)
	}, o.prototype.uncheck = function(a) {
		this.check_(!1, a)
	}, o.prototype.check_ = function(a, b) {
		this.$selectItem.filter(g('[data-index="%s"]', b)).prop("checked", a), this.data[b][this.header.stateField] = a, this.updateSelected(), this.trigger(a ? "check" : "uncheck", this.data[b])
	}, o.prototype.checkBy = function(a) {
		this.checkBy_(!0, a)
	}, o.prototype.uncheckBy = function(a) {
		this.checkBy_(!1, a)
	}, o.prototype.checkBy_ = function(b, c) {
		if (c.hasOwnProperty("field") && c.hasOwnProperty("values")) {
			var d = this,
				e = [];
			a.each(this.options.data, function(f, h) {
				return h.hasOwnProperty(c.field) ? void(-1 !== a.inArray(h[c.field], c.values) && (d.$selectItem.filter(g('[data-index="%s"]', f)).prop("checked", b), h[d.header.stateField] = b, e.push(h), d.trigger(b ? "check" : "uncheck", h))) : !1
			}), this.updateSelected(), this.trigger(b ? "check-some" : "uncheck-some", e)
		}
	}, o.prototype.destroy = function() {
		this.$el.insertBefore(this.$container), a(this.options.toolbar).insertBefore(this.$el), this.$container.next().remove(), this.$container.remove(), this.$el.html(this.$el_.html()).css("margin-top", "0").attr("class", this.$el_.attr("class") || "")
	}, o.prototype.showLoading = function() {
		this.$tableLoading.show()
	}, o.prototype.hideLoading = function() {
		this.$tableLoading.hide()
	}, o.prototype.togglePagination = function() {
		this.options.pagination = !this.options.pagination;
		var a = this.$toolbar.find('button[name="paginationSwitch"] i');
		this.options.pagination ? a.attr("class", this.options.iconsPrefix + " " + this.options.icons.paginationSwitchDown) : a.attr("class", this.options.iconsPrefix + " " + this.options.icons.paginationSwitchUp), this.updatePagination()
	}, o.prototype.refresh = function(a) {
		a && a.url && (this.options.url = a.url, this.options.pageNumber = 1), this.initServer(a && a.silent, a && a.query)
	}, o.prototype.resetWidth = function() {
		this.options.showHeader && this.options.height && this.fitHeader(), this.options.showFooter && this.fitFooter()
	}, o.prototype.showColumn = function(a) {
		this.toggleColumn(i(this.options.columns, a), !0, !0)
	}, o.prototype.hideColumn = function(a) {
		this.toggleColumn(i(this.options.columns, a), !1, !0)
	}, o.prototype.filterBy = function(b) {
		this.filterColumns = a.isEmptyObject(b) ? {} : b, this.options.pageNumber = 1, this.initSearch(), this.updatePagination()
	}, o.prototype.scrollTo = function(a) {
		return "string" == typeof a && (a = "bottom" === a ? this.$tableBody[0].scrollHeight : 0), "number" == typeof a && this.$tableBody.scrollTop(a), "undefined" == typeof a ? this.$tableBody.scrollTop() : void 0
	}, o.prototype.getScrollPosition = function() {
		return this.scrollTo()
	}, o.prototype.selectPage = function(a) {
		a > 0 && a <= this.options.totalPages && (this.options.pageNumber = a, this.updatePagination())
	}, o.prototype.prevPage = function() {
		this.options.pageNumber > 1 && (this.options.pageNumber--, this.updatePagination())
	}, o.prototype.nextPage = function() {
		this.options.pageNumber < this.options.totalPages && (this.options.pageNumber++, this.updatePagination())
	}, o.prototype.toggleView = function() {
		this.options.cardView = !this.options.cardView, this.initHeader(), this.initBody(), this.trigger("toggle", this.options.cardView)
	};
	var p = ["getOptions", "beforeSearch", "getSelections", "getAllSelections", "getData", "load", "append", "prepend", "remove", "removeAll", "insertRow", "updateRow", "updateCell", "removeByUniqueId", "showRow", "hideRow", "getRowsHidden", "mergeCells", "checkAll", "uncheckAll", "check", "uncheck", "checkBy", "uncheckBy", "refresh", "resetView", "resetWidth", "destroy", "showLoading", "hideLoading", "showColumn", "hideColumn", "filterBy", "scrollTo", "getScrollPosition", "selectPage", "prevPage", "nextPage", "togglePagination", "toggleView"];
	a.fn.bootstrapTable = function(b) {
		var c, d = Array.prototype.slice.call(arguments, 1);
		return this.each(function() {
			var e = a(this),
				f = e.data("bootstrap.table"),
				g = a.extend({}, o.DEFAULTS, e.data(), "object" == typeof b && b);
			if ("string" == typeof b) {
				if (a.inArray(b, p) < 0) throw new Error("Unknown method: " + b);
				if (!f) return;
				c = f[b].apply(f, d), "destroy" === b && e.removeData("bootstrap.table")
			}
			f || e.data("bootstrap.table", f = new o(this, g))
		}), "undefined" == typeof c ? this : c
	}, a.fn.bootstrapTable.Constructor = o, a.fn.bootstrapTable.defaults = o.DEFAULTS, a.fn.bootstrapTable.columnDefaults = o.COLUMN_DEFAULTS, a.fn.bootstrapTable.locales = o.LOCALES, a.fn.bootstrapTable.methods = p, a(function() {
		a('[data-toggle="table"]').bootstrapTable()
	})
}(jQuery), function(a) {
	"use strict";
	var b = {
		sortOrder: "bs.table.sortOrder",
		sortName: "bs.table.sortName",
		pageNumber: "bs.table.pageNumber",
		pageList: "bs.table.pageList",
		columns: "bs.table.columns",
		searchText: "bs.table.searchText"
	},
		c = function() {
			return navigator.cookieEnabled ? !0 : !1
		},
		d = function(a, b, d, e, f, g) {
			if (a.options.stateSave && c() && "" !== a.options.stateSaveIdTable) {
				var i = a.options.stateSaveIdTable,
					j = a.options.stateSaveExpire;
				return b = i + "." + b, !b || /^(?:expires|max\-age|path|domain|secure)$/i.test(b) ? !1 : (document.cookie = encodeURIComponent(b) + "=" + encodeURIComponent(d) + h(j) + (f ? "; domain=" + f : "") + (e ? "; path=" + e : "") + (g ? "; secure" : ""), !0)
			}
		},
		e = function(a, b) {
			return b = a + "." + b, b ? decodeURIComponent(document.cookie.replace(new RegExp("(?:(?:^|.*;)\\s*" + encodeURIComponent(b).replace(/[\-\.\+\*]/g, "\\$&") + "\\s*\\=\\s*([^;]*).*$)|^.*$"), "$1")) || null : null
		},
		f = function(a) {
			return a ? new RegExp("(?:^|;\\s*)" + encodeURIComponent(a).replace(/[\-\.\+\*]/g, "\\$&") + "\\s*\\=").test(document.cookie) : !1
		},
		g = function(a, b, c, d) {
			return b = a + "." + b, f(b) ? (document.cookie = encodeURIComponent(b) + "=; expires=Thu, 01 Jan 1970 00:00:00 GMT" + (d ? "; domain=" + d : "") + (c ? "; path=" + c : ""), !0) : !1
		},
		h = function(a) {
			var b = a.replace(/[0-9]/, "");
			switch (a = a.replace(/[A-Za-z]/, ""), b.toLowerCase()) {
			case "s":
				a = +a;
				break;
			case "mi":
				a = 60 * a;
				break;
			case "h":
				a = 60 * a * 60;
				break;
			case "d":
				a = 24 * a * 60 * 60;
				break;
			case "m":
				a = 30 * a * 24 * 60 * 60;
				break;
			case "y":
				a = 365 * a * 30 * 24 * 60 * 60;
				break;
			default:
				a = void 0
			}
			return void 0 === a ? "" : "; max-age=" + a
		};
	a.extend(a.fn.bootstrapTable.defaults, {
		stateSave: !1,
		stateSaveExpire: "2h",
		stateSaveIdTable: ""
	}), a.fn.bootstrapTable.methods.push("deleteCookie");
	var i = a.fn.bootstrapTable.Constructor,
		j = i.prototype.initTable,
		k = i.prototype.onSort,
		l = i.prototype.onPageNumber,
		m = i.prototype.onPageListChange,
		n = i.prototype.onPageFirst,
		o = i.prototype.onPagePre,
		p = i.prototype.onPageNext,
		q = i.prototype.onPageLast,
		r = i.prototype.toggleColumn,
		s = i.prototype.onSearch;
	i.prototype.initTable = function() {
		j.apply(this, Array.prototype.slice.apply(arguments)), this.initStateSave()
	}, i.prototype.initStateSave = function() {
		if (this.options.stateSave && c() && "" !== this.options.stateSaveIdTable) {
			var d = e(this.options.stateSaveIdTable, b.sortOrder),
				f = e(this.options.stateSaveIdTable, b.sortName),
				g = e(this.options.stateSaveIdTable, b.pageNumber),
				h = e(this.options.stateSaveIdTable, b.pageList),
				i = JSON.parse(e(this.options.stateSaveIdTable, b.columns)),
				j = e(this.options.stateSaveIdTable, b.searchText);
			d && (this.options.sortOrder = d, this.options.sortName = f), g && (this.options.pageNumber = +g), h && (this.options.pageSize = h === this.options.formatAllRows() ? h : +h), i && a.each(this.options.columns, function(a, b) {
				b.visible = -1 !== i.indexOf(a)
			}), j && (this.options.searchText = j)
		}
	}, i.prototype.onSort = function() {
		k.apply(this, Array.prototype.slice.apply(arguments)), d(this, b.sortOrder, this.options.sortOrder), d(this, b.sortName, this.options.sortName)
	}, i.prototype.onPageNumber = function() {
		l.apply(this, Array.prototype.slice.apply(arguments)), d(this, b.pageNumber, this.options.pageNumber)
	}, i.prototype.onPageListChange = function() {
		m.apply(this, Array.prototype.slice.apply(arguments)), d(this, b.pageList, this.options.pageSize)
	}, i.prototype.onPageFirst = function() {
		n.apply(this, Array.prototype.slice.apply(arguments)), d(this, b.pageNumber, this.options.pageNumber)
	}, i.prototype.onPagePre = function() {
		o.apply(this, Array.prototype.slice.apply(arguments)), d(this, b.pageNumber, this.options.pageNumber)
	}, i.prototype.onPageNext = function() {
		p.apply(this, Array.prototype.slice.apply(arguments)), d(this, b.pageNumber, this.options.pageNumber)
	}, i.prototype.onPageLast = function() {
		q.apply(this, Array.prototype.slice.apply(arguments)), d(this, b.pageNumber, this.options.pageNumber)
	}, i.prototype.toggleColumn = function() {
		r.apply(this, Array.prototype.slice.apply(arguments));
		var c = [];
		a.each(this.options.columns, function(a) {
			this.visible && c.push(a)
		}), d(this, b.columns, JSON.stringify(c))
	}, i.prototype.onSearch = function() {
		s.apply(this, Array.prototype.slice.apply(arguments)), d(this, b.searchText, this.searchText)
	}, i.prototype.deleteCookie = function(a) {
		"" !== a && c() && g(b[a])
	}
}(jQuery), !
function(a) {
	"use strict";
	a.extend(a.fn.bootstrapTable.defaults, {
		editable: !0,
		onEditableInit: function() {
			return !1
		},
		onEditableSave: function() {
			return !1
		}
	}), a.extend(a.fn.bootstrapTable.Constructor.EVENTS, {
		"editable-init.bs.table": "onEditableInit",
		"editable-save.bs.table": "onEditableSave"
	});
	var b = a.fn.bootstrapTable.Constructor,
		c = b.prototype.initTable,
		d = b.prototype.initBody;
	b.prototype.initTable = function() {
		var b = this;
		c.apply(this, Array.prototype.slice.apply(arguments)), this.options.editable && a.each(this.options.columns, function(a, c) {
			if (c.editable) {
				var d = c.formatter;
				c.formatter = function(a, e, f) {
					var g = d ? d(a, e, f) : a;
					return ['<a href="javascript:void(0)"', ' data-name="' + c.field + '"', ' data-pk="' + e[b.options.idField] + '"', ' data-value="' + g + '"', "></a>"].join("")
				}
			}
		})
	}, b.prototype.initBody = function() {
		var b = this;
		d.apply(this, Array.prototype.slice.apply(arguments)), this.options.editable && (a.each(this.options.columns, function(c, d) {
			d.editable && b.$body.find('a[data-name="' + d.field + '"]').editable(d.editable).off("save").on("save", function(c, e) {
				var f = b.getData(),
					g = a(this).parents("tr[data-index]").data("index"),
					h = f[g],
					i = h[d.field];
				h[d.field] = e.submitValue, b.trigger("editable-save", d.field, h, i, a(this))
			})
		}), this.trigger("editable-init"))
	}
}(jQuery), function(a) {
	"use strict";
	var b = {
		json: "JSON",
		xml: "XML",
		png: "PNG",
		csv: "CSV",
		txt: "TXT",
		sql: "SQL",
		doc: "MS-Word",
		excel: "Ms-Excel",
		powerpoint: "Ms-Powerpoint",
		pdf: "PDF"
	};
	a.extend(a.fn.bootstrapTable.defaults, {
		showExport: !1,
		exportTypes: ["json", "xml", "csv", "txt", "sql", "excel"],
		exportOptions: {}
	});
	var c = a.fn.bootstrapTable.Constructor,
		d = c.prototype.initToolbar;
	c.prototype.initToolbar = function() {
		if (this.showToolbar = this.options.showExport, d.apply(this, Array.prototype.slice.apply(arguments)), this.options.showExport) {
			var c = this,
				e = this.$toolbar.find(">.btn-group"),
				f = e.find("div.export");
			if (!f.length) {
				f = a(['<div class="export btn-group">', '<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" type="button">', '<i class="glyphicon glyphicon-export icon-share"></i> ', '<span class="caret"></span>', "</button>", '<ul class="dropdown-menu" role="menu">', "</ul>", "</div>"].join("")).appendTo(e);
				var g = f.find(".dropdown-menu"),
					h = this.options.exportTypes;
				if ("string" == typeof this.options.exportTypes) {
					var i = this.options.exportTypes.slice(1, -1).replace(/ /g, "").split(",");
					h = [], a.each(i, function(a, b) {
						h.push(b.slice(1, -1))
					})
				}
				a.each(h, function(a, c) {
					b.hasOwnProperty(c) && g.append(['<li data-type="' + c + '">', '<a href="javascript:void(0)">', b[c], "</a>", "</li>"].join(""))
				}), g.find("li").click(function() {
					c.$el.tableExport(a.extend({}, c.options.exportOptions, {
						type: a(this).data("type"),
						escape: !1
					}))
				})
			}
		}
	}
}(jQuery), !
function(a) {
	"use strict";
	var b = function(a) {
			var b = arguments,
				c = !0,
				d = 1;
			return a = a.replace(/%s/g, function() {
				var a = b[d++];
				return "undefined" == typeof a ? (c = !1, "") : a
			}), c ? a : ""
		},
		c = function(b, c) {
			var d = -1;
			return a.each(b, function(a, b) {
				return b.field === c ? (d = a, !1) : !0
			}), d
		},
		d = function(b, c, d, e) {
			if ("string" == typeof c) {
				var f = c.split(".");
				f.length > 1 ? (c = window, a.each(f, function(a, b) {
					c = c[b]
				})) : c = window[c]
			}
			return "object" == typeof c ? c : "function" == typeof c ? c.apply(b, d) : e
		};
	a.extend(a.fn.bootstrapTable.defaults, {
		filterControl: !1,
		onColumnSearch: function() {
			return !1
		}
	}), a.extend(a.fn.bootstrapTable.COLUMN_DEFAULTS, {
		filterControl: void 0,
		filterData: void 0
	}), a.extend(a.fn.bootstrapTable.Constructor.EVENTS, {
		"column-search.bs.table": "onColumnSearch"
	});
	var e = a.fn.bootstrapTable.Constructor,
		f = e.prototype.initHeader,
		g = e.prototype.initBody,
		h = e.prototype.initSearch;
	e.prototype.initHeader = function() {
		if (f.apply(this, Array.prototype.slice.apply(arguments)), this.options.filterControl) {
			var c, d, e = !1,
				g = this,
				h = 0;
			a.each(this.options.columns, function(f, h) {
				if (c = "hidden", d = [], h.visible) {
					if (h.filterControl) switch (d.push('<div style="margin: 0px 2px 2px 2px;" class="filterControl">'), h.filterControl && h.searchable && (e = !0, c = "visible"), h.filterControl.toLowerCase()) {
					case "input":
						d.push(b('<input type="text" class="form-control" style="width: 100%; visibility: %s">', c));
						break;
					case "select":
						d.push(b('<select class="%s form-control" style="width: 100%; visibility: %s"></select>', h.field, c))
					} else d.push('<div style="height: 34px;"></div>');
					if (g.$header.find(b('.th-inner:eq("%s")', f)).next().append(d.join("")), void 0 !== h.filterData && "column" !== h.filterData.toLowerCase()) {
						var i = h.filterData.substring(0, 3),
							j = h.filterData.substring(4, h.filterData.length),
							k = a("." + h.field);
						switch (k.append(a("<option></option>").attr("value", "").text("")), i) {
						case "url":
							a.ajax({
								url: j,
								dataType: "json",
								success: function(b) {
									a.each(b, function(b, c) {
										k.append(a("<option></option>").attr("value", b).text(c))
									})
								}
							});
							break;
						case "var":
							var l = window[j];
							for (var m in l) k.append(a("<option></option>").attr("value", m).text(l[m]))
						}
					}
				}
			}), e ? (this.$header.off("keyup", "input").on("keyup", "input", function(a) {
				clearTimeout(h), h = setTimeout(function() {
					g.onColumnSearch(a)
				}, g.options.searchTimeOut)
			}), this.$header.off("change", "select").on("change", "select", function(a) {
				clearTimeout(h), h = setTimeout(function() {
					g.onColumnSearch(a)
				}, g.options.searchTimeOut)
			})) : this.$header.find(".filterControl").hide()
		}
	}, e.prototype.initBody = function() {
		g.apply(this, Array.prototype.slice.apply(arguments));
		for (var b = this, e = this.getData(), f = this.pageFrom - 1; f < this.pageTo; f++) {
			var h = e[f];
			a.each(this.header.fields, function(e, g) {
				var i = h[g],
					j = b.options.columns[c(b.options.columns, g)];
				if (i = d(b.header, b.header.formatters[e], [i, h, f], i), !(j.checkbox && j.radio || void 0 === j.filterControl || "select" !== j.filterControl.toLowerCase() || !j.searchable || void 0 !== j.filterData && "column" !== j.filterData.toLowerCase())) {
					var k, l = a("." + j.field),
						m = 0,
						n = !1;
					if (void 0 !== l) if (k = l.get(0).options, 0 === k.length) l.append(a("<option></option>").attr("value", "").text("")), l.append(a("<option></option>").attr("value", i).text(i));
					else {
						for (; m < k.length; m++) if (k[m].value === i) {
							n = !0;
							break
						}
						n || l.append(a("<option></option>").attr("value", i).text(i))
					}
				}
			})
		}
	}, e.prototype.initSearch = function() {
		h.apply(this, Array.prototype.slice.apply(arguments));
		var b = this,
			c = a.isEmptyObject(this.filterColumnsPartial) ? null : this.filterColumnsPartial;
		this.data = c ? a.grep(this.data, function(e, f) {
			for (var g in c) {
				var h = c[g].toLowerCase(),
					i = e[g];
				if (i = d(b.header, b.header.formatters[a.inArray(g, b.header.fields)], [i, e, f], i), -1 === a.inArray(g, b.header.fields) || "string" != typeof i && "number" != typeof i || -1 === (i + "").toLowerCase().indexOf(h)) return !1
			}
			return !0
		}) : this.data
	}, e.prototype.onColumnSearch = function(b) {
		var c = a.trim(a(b.currentTarget).val()),
			d = a(b.currentTarget).parent().parent().parent().data("field");
		a.isEmptyObject(this.filterColumnsPartial) && (this.filterColumnsPartial = {}), c ? this.filterColumnsPartial[d] = c : delete this.filterColumnsPartial[d], this.options.pageNumber = 1, this.onSearch(b), this.updatePagination(), this.trigger("column-search", d, c)
	}
}(jQuery), !
function(a) {
	"use strict";
	a.extend(a.fn.bootstrapTable.defaults, {
		showFilter: !1
	});
	var b = a.fn.bootstrapTable.Constructor,
		c = b.prototype.init,
		d = b.prototype.initSearch;
	b.prototype.init = function() {
		c.apply(this, Array.prototype.slice.apply(arguments));
		var b = this;
		this.$el.on("load-success.bs.table", function() {
			b.options.showFilter && a(b.options.toolbar).bootstrapTableFilter({
				connectTo: b.$el
			})
		})
	}, b.prototype.initSearch = function() {
		d.apply(this, Array.prototype.slice.apply(arguments)), "server" !== this.options.sidePagination && "function" == typeof this.searchCallback && (this.data = a.grep(this.options.data, this.searchCallback))
	}, b.prototype.getData = function() {
		return this.searchText || this.searchCallback ? this.data : this.options.data
	}, b.prototype.getColumns = function() {
		return this.options.columns
	}, b.prototype.registerSearchCallback = function(a) {
		this.searchCallback = a
	}, b.prototype.updateSearch = function() {
		this.options.pageNumber = 1, this.initSearch(), this.updatePagination()
	}, b.prototype.getServerUrl = function() {
		return "server" === this.options.sidePagination ? this.options.url : !1
	}, a.fn.bootstrapTable.methods.push("getColumns", "registerSearchCallback", "updateSearch", "getServerUrl")
}(jQuery), function(a) {
	"use strict";
	a.extend(a.fn.bootstrapTable.defaults, {
		flat: !1
	});
	var b = a.fn.bootstrapTable.Constructor,
		c = b.prototype.initData;
	b.prototype.initData = function(a, b) {
		this.options.flat && (a = void 0 === a ? this.options.data : a, a = d.flatHelper(a)), c.apply(this, [a, b])
	};
	var d = {
		flat: function(b) {
			function c(b, e) {
				if (Object(b) !== b) d[e] = b;
				else if (a.isArray(b)) for (var f = 0, g = b.length; g > f; f++) c(b[f], e ? e + "." + f : "" + f), 0 == g && (d[e] = []);
				else {
					var h = !0;
					for (var i in b) h = !1, c(b[i], e ? e + "." + i : i);
					h && (d[e] = {})
				}
			}
			var d = {};
			return c(b, ""), d
		},
		flatHelper: function(b) {
			var c = [],
				e = [];
			return a.isArray(b) || (e.push(b), b = e), a.each(b, function(a, b) {
				c.push(d.flat(b))
			}), c
		}
	}
}(jQuery), !
function(a) {
	"use strict";
	a.extend(a.fn.bootstrapTable.defaults, {
		keyEvents: !1
	});
	var b = a.fn.bootstrapTable.Constructor,
		c = b.prototype.init;
	b.prototype.init = function() {
		c.apply(this, Array.prototype.slice.apply(arguments)), this.initKeyEvents()
	}, b.prototype.initKeyEvents = function() {
		if (this.options.keyEvents) {
			var b = this;
			a(document).off("keydown").on("keydown", function(a) {
				var c = b.$toolbar.find(".search input"),
					d = b.$toolbar.find('button[name="refresh"]'),
					e = b.$toolbar.find('button[name="toggle"]'),
					f = b.$toolbar.find('button[name="paginationSwitch"]');
				if (document.activeElement === c.get(0)) return !0;
				switch (a.keyCode) {
				case 83:
					if (!b.options.search) return;
					return c.focus(), !1;
				case 82:
					if (!b.options.showRefresh) return;
					return d.click(), !1;
				case 84:
					if (!b.options.showToggle) return;
					return e.click(), !1;
				case 80:
					if (!b.options.showPaginationSwitch) return;
					return f.click(), !1;
				case 37:
					if (!b.options.pagination) return;
					return b.prevPage(), !1;
				case 39:
					if (!b.options.pagination) return;
					return void b.nextPage()
				}
			})
		}
	}
}(jQuery), !
function(a) {
	"use strict";
	var b = function(a) {
			(a.options.height || a.options.showFooter) && setTimeout(a.resetView(), 1)
		},
		c = function(a, c, h) {
			a.options.minHeight ? d(c, a.options.minWidth) && d(h, a.options.minHeight) ? f(a) : e(c, a.options.minWidth) && e(h, a.options.minHeight) && g(a) : d(c, a.options.minWidth) ? f(a) : e(c, a.options.minWidth) && g(a), b(a)
		},
		d = function(a, b) {
			return b >= a
		},
		e = function(a, b) {
			return a > b
		},
		f = function(a) {
			h(a, !1)
		},
		g = function(a) {
			h(a, !0)
		},
		h = function(a, b) {
			a.options.cardView = b, a.toggleView()
		};
	a.extend(a.fn.bootstrapTable.defaults, {
		mobileResponsive: !1,
		minWidth: 562,
		minHeight: void 0,
		checkOnInit: !0,
		toggled: !1
	});
	var i = a.fn.bootstrapTable.Constructor,
		j = i.prototype.init;
	i.prototype.init = function() {
		if (j.apply(this, Array.prototype.slice.apply(arguments)), this.options.mobileResponsive && this.options.minWidth) {
			var b = this;
			a(window).resize(function() {
				c(b, a(this).width(), a(this).height())
			}), this.options.checkOnInit && c(this, a(window).width(), a(window).height())
		}
	}
}(jQuery), function(a) {
	"use strict";
	var b = !1,
		c = {
			asc: "Ascending",
			desc: "Descending"
		},
		d = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAATCAYAAAByUDbMAAAAZ0lEQVQ4y2NgGLKgquEuFxBPAGI2ahhWCsS/gDibUoO0gPgxEP8H4ttArEyuQYxAPBdqEAxPBImTY5gjEL9DM+wTENuQahAvEO9DMwiGdwAxOymGJQLxTyD+jgWDxCMZRsEoGAVoAADeemwtPcZI2wAAAABJRU5ErkJggg==",
		e = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAATCAYAAAByUDbMAAAAZUlEQVQ4y2NgGAWjYBSggaqGu5FA/BOIv2PBIPFEUgxjB+IdQPwfC94HxLykus4GiD+hGfQOiB3J8SojEE9EM2wuSJzcsFMG4ttQgx4DsRalkZENxL+AuJQaMcsGxBOAmGvopk8AVz1sLZgg0bsAAAAASUVORK5CYII= ",
		f = function(b) {
			if (!a("#sortModal").hasClass("modal")) {
				var c = '  <div class="modal fade" id="sortModal" tabindex="-1" role="dialog" aria-labelledby="sortModalLabel" aria-hidden="true">';
				c += '         <div class="modal-dialog">', c += '             <div class="modal-content">', c += '                 <div class="modal-header">', c += '                     <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>', c += '                     <h4 class="modal-title" id="sortModalLabel">' + b.options.formatMultipleSort() + "</h4>", c += "                 </div>", c += '                 <div class="modal-body">', c += '                     <div class="bootstrap-table">', c += '                         <div class="fixed-table-toolbar">', c += '                             <div class="bars">', c += '                                 <div id="toolbar">', c += '                                     <button id="add" type="button" class="btn btn-default"><i class="' + b.options.iconsPrefix + " " + b.options.icons.plus + '"></i> ' + b.options.formatAddLevel() + "</button>", c += '                                     <button id="delete" type="button" class="btn btn-default" disabled><i class="' + b.options.iconsPrefix + " " + b.options.icons.minus + '"></i> ' + b.options.formatDeleteLevel() + "</button>", c += "                                 </div>", c += "                             </div>", c += "                         </div>", c += '                         <div class="fixed-table-container">', c += '                             <table id="multi-sort" class="table">', c += "                                 <thead>", c += "                                     <tr>", c += "                                         <th></th>", c += '                                         <th><div class="th-inner">' + b.options.formatColumn() + "</div></th>", c += '                                         <th><div class="th-inner">' + b.options.formatOrder() + "</div></th>", c += "                                     </tr>", c += "                                 </thead>", c += "                                 <tbody></tbody>", c += "                             </table>", c += "                         </div>", c += "                     </div>", c += "                 </div>", c += '                 <div class="modal-footer">', c += '                     <button type="button" class="btn btn-default" data-dismiss="modal">' + b.options.formatCancel() + "</button>", c += '                     <button type="button" class="btn btn-primary">' + b.options.formatSort() + "</button>", c += "                 </div>", c += "             </div>", c += "         </div>", c += "     </div>", a("body").append(a(c));
				var d = a("#sortModal"),
					e = d.find("tbody > tr");
				if (d.off("click", "#add").on("click", "#add", function() {
					var a = d.find(".multi-sort-name:first option").length,
						c = d.find("tbody tr").length;
					a > c && (c++, b.addLevel(), b.setButtonStates())
				}), d.off("click", "#delete").on("click", "#delete", function() {
					var a = d.find(".multi-sort-name:first option").length,
						c = d.find("tbody tr").length;
					c > 1 && a >= c && (c--, d.find("tbody tr:last").remove(), b.setButtonStates())
				}), d.off("click", ".btn-primary").on("click", ".btn-primary", function() {
					var c = d.find("tbody > tr"),
						e = d.find("div.alert"),
						f = [],
						g = [];
					b.options.sortPriority = a.map(c, function(b) {
						var c = a(b),
							d = c.find(".multi-sort-name").val(),
							e = c.find(".multi-sort-order").val();
						return f.push(d), {
							sortName: d,
							sortOrder: e
						}
					});
					for (var h = f.sort(), i = 0; i < f.length - 1; i++) h[i + 1] == h[i] && g.push(h[i]);
					g.length > 0 ? 0 === e.length && (e = '<div class="alert alert-danger" role="alert"><strong>' + b.options.formatDuplicateAlertTitle() + "</strong> " + b.options.formatDuplicateAlertDescription() + "</div>", a(e).insertBefore(d.find(".bars"))) : (1 === e.length && a(e).remove(), b.options.sortName = "", b.onMultipleSort(), d.modal("hide"))
				}), null === b.options.sortPriority && b.options.sortName && (b.options.sortPriority = [{
					sortName: b.options.sortName,
					sortOrder: b.options.sortOrder
				}]), null !== b.options.sortPriority) {
					if (e.length < b.options.sortPriority.length && "object" == typeof b.options.sortPriority) for (var f = 0; f < b.options.sortPriority.length; f++) b.addLevel(f, b.options.sortPriority[f])
				} else b.addLevel(0);
				b.setButtonStates()
			}
		};
	a.extend(a.fn.bootstrapTable.defaults, {
		showMultiSort: !1,
		sortPriority: null,
		onMultipleSort: function() {
			return !1
		}
	}), a.extend(a.fn.bootstrapTable.defaults.icons, {
		sort: "glyphicon-sort",
		plus: "glyphicon-plus",
		minus: "glyphicon-minus"
	}), a.extend(a.fn.bootstrapTable.Constructor.EVENTS, {
		"multiple-sort.bs.table": "onMultipleSort"
	}), a.extend(a.fn.bootstrapTable.locales, {
		formatMultipleSort: function() {
			return "Multiple Sort"
		},
		formatAddLevel: function() {
			return "Add Level"
		},
		formatDeleteLevel: function() {
			return "Delete Level"
		},
		formatColumn: function() {
			return "Column"
		},
		formatOrder: function() {
			return "Order"
		},
		formatSortBy: function() {
			return "Sort by"
		},
		formatThenBy: function() {
			return "Then by"
		},
		formatSort: function() {
			return "Sort"
		},
		formatCancel: function() {
			return "Cancel"
		},
		formatDuplicateAlertTitle: function() {
			return "Duplicate(s) detected!"
		},
		formatDuplicateAlertDescription: function() {
			return "Please remove or change any duplicate column."
		}
	}), a.extend(a.fn.bootstrapTable.defaults, a.fn.bootstrapTable.locales);
	var g = a.fn.bootstrapTable.Constructor,
		h = g.prototype.initToolbar;
	g.prototype.initToolbar = function() {
		this.showToolbar = !0;
		var c = this;
		if (h.apply(this, Array.prototype.slice.apply(arguments)), this.options.showMultiSort) {
			var d = this.$toolbar.find(">.btn-group"),
				e = d.find("div.multi-sort");
			e.length || (e = '  <button class="multi-sort btn btn-default' + (void 0 === this.options.iconSize ? "" : " btn-" + this.options.iconSize) + '" type="button" data-toggle="modal" data-target="#sortModal" title="' + this.options.formatMultipleSort() + '">', e += '     <i class="' + this.options.iconsPrefix + " " + this.options.icons.sort + '"></i>', e += "</button>", d.append(e), f(c)), this.$el.one("sort.bs.table", function() {
				b = !0
			}), this.$el.on("multiple-sort.bs.table", function() {
				b = !1
			}), this.$el.on("load-success.bs.table", function() {
				b || null === c.options.sortPriority || "object" != typeof c.options.sortPriority || c.onMultipleSort()
			}), this.$el.on("column-switch.bs.table", function() {
				c.options.sortPriority = null, a("#sortModal").remove(), f(c)
			})
		}
	}, g.prototype.onMultipleSort = function() {
		var b = this,
			c = function(a, b) {
				return a > b ? 1 : b > a ? -1 : 0
			},
			d = function(d, e) {
				for (var f = [], g = [], h = 0; h < b.options.sortPriority.length; h++) {
					var i = "desc" === b.options.sortPriority[h].sortOrder ? -1 : 1,
						j = d[b.options.sortPriority[h].sortName],
						k = e[b.options.sortPriority[h].sortName];
					(void 0 === j || null === j) && (j = ""), (void 0 === k || null === k) && (k = ""), a.isNumeric(j) && a.isNumeric(k) && (j = parseFloat(j), k = parseFloat(k)), "string" != typeof j && (j = j.toString()), f.push(i * c(j, k)), g.push(i * c(k, j))
				}
				return c(f, g)
			};
		this.data.sort(function(a, b) {
			return d(a, b)
		}), this.initBody(), this.assignSortableArrows(), this.trigger("multiple-sort")
	}, g.prototype.addLevel = function(b, d) {
		var e = a("#sortModal"),
			f = 0 === b ? this.options.formatSortBy() : this.options.formatThenBy();
		e.find("tbody").append(a("<tr>").append(a("<td>").text(f)).append(a("<td>").append(a('<select class="form-control multi-sort-name">'))).append(a("<td>").append(a('<select class="form-control multi-sort-order">'))));
		var g = e.find(".multi-sort-name").last(),
			h = e.find(".multi-sort-order").last();
		this.options.columns.forEach(function(a) {
			return a.sortable === !1 || a.visible === !1 ? !0 : void g.append('<option value="' + a.field + '">' + a.title + "</option>")
		}), a.each(c, function(a, b) {
			h.append('<option value="' + a + '">' + b + "</option>")
		}), void 0 !== d && (g.find('option[value="' + d.sortName + '"]').attr("selected", !0), h.find('option[value="' + d.sortOrder + '"]').attr("selected", !0))
	}, g.prototype.assignSortableArrows = function() {
		for (var b = this, c = b.$header.find("th"), f = 0; f < c.length; f++) for (var g = 0; g < b.options.sortPriority.length; g++) a(c[f]).data("field") === b.options.sortPriority[g].sortName && a(c[f]).find(".sortable").css("background-image", "url(" + ("desc" === b.options.sortPriority[g].sortOrder ? e : d) + ")")
	}, g.prototype.setButtonStates = function() {
		var b = a("#sortModal"),
			c = b.find(".multi-sort-name:first option").length,
			d = b.find("tbody tr").length;
		d == c && b.find("#add").attr("disabled", "disabled"), d > 1 && b.find("#delete").removeAttr("disabled"), c > d && b.find("#add").removeAttr("disabled"), 1 == d && b.find("#delete").attr("disabled", "disabled")
	}
}(jQuery), !
function(a) {
	"use strict";
	var b = function(b, c) {
			var d = -1;
			return a.each(b, function(a, b) {
				return b.field === c ? (d = a, !1) : !0
			}), d
		};
	a.extend(a.fn.bootstrapTable.defaults, {
		reorderableColumns: !1,
		maxMovingRows: 10,
		onReorderColumn: function() {
			return !1
		}
	}), a.extend(a.fn.bootstrapTable.Constructor.EVENTS, {
		"reorder-column.bs.table": "onReorderColumn"
	});
	var c = a.fn.bootstrapTable.Constructor,
		d = c.prototype.initHeader,
		e = c.prototype.toggleColumn,
		f = c.prototype.toggleView,
		g = c.prototype.resetView;
	c.prototype.initHeader = function() {
		d.apply(this, Array.prototype.slice.apply(arguments)), this.options.reorderableColumns && this.makeRowsReorderable()
	}, c.prototype.toggleColumn = function() {
		e.apply(this, Array.prototype.slice.apply(arguments)), this.options.reorderableColumns && this.makeRowsReorderable()
	}, c.prototype.toggleView = function() {
		f.apply(this, Array.prototype.slice.apply(arguments)), this.options.reorderableColumns && (this.options.cardView || this.makeRowsReorderable())
	}, c.prototype.resetView = function() {
		g.apply(this, Array.prototype.slice.apply(arguments)), this.options.reorderableColumns && this.makeRowsReorderable()
	}, c.prototype.makeRowsReorderable = function() {
		var c = this;
		try {
			a(this.$el).dragtable("destroy")
		} catch (d) {}
		a(this.$el).dragtable({
			maxMovingRows: c.options.maxMovingRows,
			clickDelay: 200,
			beforeStop: function() {
				var d = [],
					e = [],
					f = -1;
				c.$header.find("th").each(function() {
					d.push(a(this).data("field"))
				});
				for (var g = 0; g < d.length; g++) f = b(c.options.columns, d[g]), -1 !== f && (e.push(c.options.columns[f]), c.options.columns.splice(f, 1));
				c.options.columns = c.options.columns.concat(e), c.header.fields = d, c.resetView(), c.trigger("reorder-column", d)
			}
		})
	}
}(jQuery), !
function(a) {
	"use strict";
	var b = function(a, b) {
			return {
				id: "customId_" + b
			}
		};
	a.extend(a.fn.bootstrapTable.defaults, {
		reorderableRows: !1,
		onDragStyle: null,
		onDropStyle: null,
		onDragClass: "reorder_rows_onDragClass",
		dragHandle: null,
		useRowAttrFunc: !1,
		onReorderRowsDrag: function() {
			return !1
		},
		onReorderRowsDrop: function() {
			return !1
		},
		onReorderRow: function() {
			return !1
		}
	}), a.extend(a.fn.bootstrapTable.Constructor.EVENTS, {
		"reorder-row.bs.table": "onReorderRow"
	});
	var c = a.fn.bootstrapTable.Constructor,
		d = c.prototype.init,
		e = c.prototype.initSearch;
	c.prototype.init = function() {
		if (d.apply(this, Array.prototype.slice.apply(arguments)), this.options.reorderableRows) {
			var a = this;
			this.options.useRowAttrFunc && (this.options.rowAttributes = b);
			var c = this.options.onPostBody;
			this.options.onPostBody = function() {
				setTimeout(function() {
					a.makeRowsReorderable(), c.apply()
				}, 1)
			}
		}
	}, c.prototype.initSearch = function() {
		e.apply(this, Array.prototype.slice.apply(arguments)), !this.options.reorderableRows
	}, c.prototype.makeRowsReorderable = function() {
		if (!this.options.cardView) {
			var a = this;
			this.$el.tableDnD({
				onDragStyle: a.options.onDragStyle,
				onDropStyle: a.options.onDropStyle,
				onDragClass: a.options.onDragClass,
				onDrop: a.onDrop,
				onDragStart: a.options.onReorderRowsDrag,
				dragHandle: a.options.dragHandle
			})
		}
	}, c.prototype.onDrop = function(b, c) {
		for (var d = a(b), e = d.data("bootstrap.table"), f = d.data("bootstrap.table").options, c = null, g = [], h = 0; h < b.tBodies[0].rows.length; h++) c = a(b.tBodies[0].rows[h]), g.push(f.data[c.data("index")]), c.data("index", h).attr("data-index", h);
		f.data = g, f.onReorderRowsDrop.apply(b, c), e.trigger("reorder-row", g)
	}
}(jQuery), function(a) {
	"use strict";
	var b = function(a) {
			a.$el.colResizable({
				disable: !0
			}), a.$el.colResizable({
				liveDrag: a.options.liveDrag,
				fixed: a.options.fixed,
				headerOnly: a.options.headerOnly,
				minWidth: a.options.minWidth,
				hoverCursor: a.options.hoverCursor,
				dragCursor: a.options.dragCursor,
				onResize: a.onResize,
				onDrag: a.options.onResizableDrag
			})
		};
	a.extend(a.fn.bootstrapTable.defaults, {
		resizable: !1,
		liveDrag: !1,
		fixed: !0,
		headerOnly: !1,
		minWidth: 15,
		hoverCursor: "e-resize",
		dragCursor: "e-resize",
		onResizableResize: function() {
			return !1
		},
		onResizableDrag: function() {
			return !1
		}
	});
	var c = a.fn.bootstrapTable.Constructor,
		d = c.prototype.toggleView,
		e = c.prototype.resetView;
	c.prototype.toggleView = function() {
		d.apply(this, Array.prototype.slice.apply(arguments)), this.options.resizable && this.options.cardView && a(this.$el).colResizable({
			disable: !0
		})
	}, c.prototype.resetView = function() {
		var a = this;
		e.apply(this, Array.prototype.slice.apply(arguments)), this.options.resizable && setTimeout(function() {
			b(a)
		}, 100)
	}, c.prototype.onResize = function(b) {
		var c = a(b.currentTarget);
		c.bootstrapTable("resetView"), c.data("bootstrap.table").options.onResizableResize.apply(b)
	}
}(jQuery), !
function(a) {
	"use strict";
	var b = !1,
		c = function(a) {
			var b = arguments,
				c = !0,
				d = 1;
			return a = a.replace(/%s/g, function() {
				var a = b[d++];
				return "undefined" == typeof a ? (c = !1, "") : a
			}), c ? a : ""
		},
		d = function(b, c, d, e) {
			if ("string" == typeof c) {
				var f = c.split(".");
				f.length > 1 ? (c = window, a.each(f, function(a, b) {
					c = c[b]
				})) : c = window[c]
			}
			return "object" == typeof c ? c : "function" == typeof c ? c.apply(b, d) : e
		},
		e = function(b, d, e, g) {
			if (a("#avdSearchModal").hasClass("modal")) a("#avdSearchModal").modal();
			else {
				var h = '<div id="avdSearchModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">';
				h += '<div class="modal-dialog modal-xs">', h += ' <div class="modal-content">', h += '  <div class="modal-header">', h += '   <button type="button" class="close" data-dismiss="modal" aria-hidden="true" >&times;</button>', h += c('   <h4 class="modal-title">%s</h4>', d), h += "  </div>", h += '  <div class="modal-body modal-body-custom">', h += '   <div class="container-fluid" id="avdSearchModalContent" style="padding-right: 0px;padding-left: 0px;" >', h += "   </div>", h += "  </div>", h += "  </div>", h += " </div>", h += "</div>", a("body").append(a(h));
				var i = f(b, e, g),
					j = 0;
				a("#avdSearchModalContent").append(i.join("")), a("#" + g.options.idForm).off("keyup blur", "input").on("keyup blur", "input", function(a) {
					clearTimeout(j), j = setTimeout(function() {
						g.onColumnAdvancedSearch(a)
					}, g.options.searchTimeOut)
				}), a("#btnCloseAvd").click(function() {
					a("#avdSearchModal").modal("hide")
				}), a("#avdSearchModal").modal()
			}
		},
		f = function(a, b, d) {
			var e = [];
			e.push(c('<form class="form-horizontal" id="%s" action="%s" >', d.options.idForm, d.options.actionForm));
			for (var f in a) {
				var g = a[f];
				!g.checkbox && g.visible && g.searchable && (e.push('<div class="form-group">'), 
						e.push(c('<label class="col-sm-4 control-label">%s</label>', g.title)), 
						e.push('<div class="col-sm-6">'), 
						e.push(c('<input type="text" class="form-control input-md" name="%s" placeholder="%s" id="%s">',
								g.field, g.title, g.field)), e.push("</div>"), e.push("</div>"))
			}
			return e.push('<div class="form-group">'), e.push('<div class="col-sm-offset-9 col-sm-3">'), 
			e.push(c('<button type="button" id="btnCloseAvd" class="btn btn-default" >%s</button>', b)),
			e.push("</div>"), e.push("</div>"), e.push("</form>"), e
		};
	a.extend(a.fn.bootstrapTable.defaults, {
		advancedSearch: !1,
		idForm: "advancedSearch",
		actionForm: "",
		idTable: void 0,
		onColumnAdvancedSearch: function() {
			return !1
		}
	}), a.extend(a.fn.bootstrapTable.defaults.icons, {
		advancedSearchIcon: "glyphicon-chevron-down"
	}), a.extend(a.fn.bootstrapTable.Constructor.EVENTS, {
		"column-advanced-search.bs.table": "onColumnAdvancedSearch"
	}), a.extend(a.fn.bootstrapTable.locales, {
		formatAdvancedSearch: function() {
			return "Advanced search"
		},
		formatAdvancedCloseButton: function() {
			return "Close"
		}
	}), a.extend(a.fn.bootstrapTable.defaults, a.fn.bootstrapTable.locales);
	var g = a.fn.bootstrapTable.Constructor,
		h = g.prototype.initToolbar,
		i = g.prototype.load,
		j = g.prototype.initSearch;
	g.prototype.initToolbar = function() {
		if (h.apply(this, Array.prototype.slice.apply(arguments)), this.options.search && this.options.advancedSearch) {
			var a = this,
				b = [];
			b.push(c('<div class="columns columns-%s btn-group pull-%s" role="group">', this.options.buttonsAlign, this.options.buttonsAlign)), b.push(c('<button class="btn btn-default%s" type="button" name="advancedSearch" title="%s">', void 0 === a.options.iconSize ? "" : " btn-" + a.options.iconSize, a.options.formatAdvancedSearch())), b.push(c('<i class="%s %s"></i>', a.options.iconsPrefix, a.options.icons.advancedSearchIcon)), b.push("</button></div>"), a.$toolbar.prepend(b.join("")), a.$toolbar.find('button[name="advancedSearch"]').off("click").on("click", function() {
				e(a.options.columns, a.options.formatAdvancedSearch(), a.options.formatAdvancedCloseButton(), a)
			})
		}
	}, g.prototype.load = function() {
		if (i.apply(this, Array.prototype.slice.apply(arguments)), "undefined" != typeof this.options.idTable && !b) {
			var c = parseInt(a(".bootstrap-table").height());
			c += 10, a("#" + this.options.idTable).bootstrapTable("resetView", {
				height: c
			}), b = !0
		}
	}, g.prototype.initSearch = function() {
		j.apply(this, Array.prototype.slice.apply(arguments));
		var b = this,
			c = a.isEmptyObject(this.filterColumnsPartial) ? null : this.filterColumnsPartial;
		this.data = c ? a.grep(this.data, function(e, f) {
			for (var g in c) {
				var h = c[g].toLowerCase(),
					i = e[g];
				if (i = d(b.header, b.header.formatters[a.inArray(g, b.header.fields)], [i, e, f], i), -1 === a.inArray(g, b.header.fields) || "string" != typeof i && "number" != typeof i || -1 === (i + "").toLowerCase().indexOf(h)) return !1
			}
			return !0
		}) : this.data
	}, g.prototype.onColumnAdvancedSearch = function(b) {
		var c = a.trim(a(b.currentTarget).val()),
			d = a(b.currentTarget)[0].id;
		a.isEmptyObject(this.filterColumnsPartial) && (this.filterColumnsPartial = {}), c ? this.filterColumnsPartial[d] = c : delete this.filterColumnsPartial[d], this.options.pageNumber = 1, this.onSearch(b), this.updatePagination(), this.trigger("column-advanced-search", d, c)
	}
}(jQuery);