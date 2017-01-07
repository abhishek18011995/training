Ext.application({
	name: 'AM',
	appFolder: 'app',
	views: ['AM.view.List', 'AM.view.UpdateForm','AM.view.NewList'],
	controllers: ['AM.controller.Users'],
	launch: function() {
		Ext.create('Ext.container.Viewport',{
			layout : {
                type  : 'hbox',
                align : 'stretch'
            },
			items: [{
				xtype: 'userlist',
				title: 'This is sample',
				flex:1
			},{
				xtype: 'newList',
				title: 'This is sample',
				flex:1
			}]
		});
	}
	});