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

    	 var store = Ext.getStore('oldData');
    	 store.insert(0,e);
    	 console.log(store);

// var newList=Ext.create('widget.newList');
// var newStore=newList.store;
// newStore.insert(0,e);
// console.log(newStore);


    	 // console.log();
        // var newList = Ext.ComponentQuery.query('newList')[0].getStore().data.items[0].data;
 //        var store = Ext.ComponentQuery.query('newList')[0].getStore();
 //        var newList1=Ext.ComponentQuery.query('newList')[0];
 // console.log(e.data)
		// newList1.reconfigure(store,e.data);
		// store.loadRecord(e.data);
        // console.log(newList);
        // console.log(grid.getSelectionModel().getSelection()[0].data);
        // console.log(newList1);
        // console.log(Ext.getClass('AM.view.NewList').getName());
        
        // var update=newList.down();
        //  var store = Ext.getStore('NewList');
        // var type=Ext.getXType('newList');
        // console.log(newList.getSelectionModel().set(e.data));

        // console.log(.getSelectionModel( ));
        // var uForm = Ext.create('widget.useredit');
        // uForm.down('form').loadRecord(e);
    }
});
