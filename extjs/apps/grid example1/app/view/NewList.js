Ext.define('AM.view.List' ,{
    extend: 'Ext.grid.Panel',
    alias: 'widget.newUserList',

    title: 'All New Users',

    initComponent: function() {
    	this.title= 'New title';
        this.store = {
            fields: ['name', 'email'],
            data  : [
                {name: 'Ed',    email: 'ed@sencha.com'},
                {name: 'Tommy', email: 'tommy@sencha.com'}
            ]
        };

        this.columns = [
            {header: 'Name',  dataIndex: 'name',  flex: 1},
            {header: 'Email', dataIndex: 'email', flex: 1}
        ];

        this.callParent(arguments);
    }
});