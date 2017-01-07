Ext.define('AM.controller.Users', {
	extend: 'Ext.app.Controller',
	init: function() {
		this.control({
			 'userlist': {
	                render: function() {
	                	console.log('inside render event');
	                },
	                itemdblclick: this.onDbClickonGridRow
		
	            }
		})
	},
	onDbClickonGridRow: function(event, e, eOpts) {
		console.log(e.data);
		var uForm = Ext.create('widget.useredit');
		uForm.down('form').loadRecord(e);
	}
});