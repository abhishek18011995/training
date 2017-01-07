Ext.define('AM.store.OldData', {
    extend  : 'Ext.data.Store',

    fields: ['name', 'email'],
    
    storeId : 'People',
    
    data  : [
                {name: 'Ed1',    email: 'ed@sencha.com'},
                {name: 'Tommy', email: 'tommy@sencha.com'}
            ]
});