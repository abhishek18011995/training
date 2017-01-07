Ext.application({
	name: 'AM',
	appFolder: 'app',
	views: ['AM.view.List', 'AM.view.UpdateForm','AM.view.NewList'],
	controllers: ['AM.controller.Users'],
	launch: function() {
		Ext.create('Ext.container.Viewport',{
			items: [{
				xtype: 'userlist',
				title: 'This is sample'
			}]
		});
	}
	});