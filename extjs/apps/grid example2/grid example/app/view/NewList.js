var newdata=Ext.define('AM.view.NewList' ,{
    extend: 'Ext.grid.Panel',
    alias: 'widget.newList',
    name:"newList",
    title: 'All Users',


    initComponent: function() {
    	this.title= 'New title';
        this.store = {
            storeId:"oldData",
            fields: ['name', 'email'],
            // data  : [
            //     {name: 'Ed1',    email: 'ed@sencha.com'},
            //     {name: 'Tommy', email: 'tommy@sencha.com'}
            // ]
        };

        this.columns = [
            {header: 'Name',  dataIndex: 'name',  flex: 1},
            {header: 'Email', dataIndex: 'email', flex: 1}
        ];

        this.callParent(arguments);
    }
});