Ext.application({
	name: 'AM',
	appFolder: 'app',
	views: ['AM.view.List', 'AM.view.UpdateForm','AM.view.NewList'],
	controllers: ['AM.controller.Users','AM.controller.UserForm'],
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
				xtype: 'useredit',
				title: 'This is sample',
				flex:1
			}]
		});
	}
	});