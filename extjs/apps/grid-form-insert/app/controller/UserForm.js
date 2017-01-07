Ext.define('AM.controller.UserForm', {
    extend: 'Ext.app.Controller',
    init: function() {
        this.control({
            // 'useredit > button#saveData': {
            'button[itemId=saveData]': {
                click: this.onSaveButtonClick,
            },
            'button[itemId=addData]': {
                click: this.onAddButtonClick,
            }
        })
    },

    onSaveButtonClick: function(btn) {


        var grid = Ext.ComponentQuery.query('grid[itemId=oldList]')[0];
        var data = btn.up('form').getValues();
        grid.getSelectionModel().getSelection()[0].set(data);

    },
    onAddButtonClick: function(btn) {

        var data = btn.up('form').getValues();
        var store=Ext.ComponentQuery.query('grid[itemId=oldList]')[0].getStore();
        store.insert(0,data);
        console.log(data);
        console.log(store);

    }
});
