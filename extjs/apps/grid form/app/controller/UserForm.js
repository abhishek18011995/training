Ext.define('AM.controller.UserForm', {
    extend: 'Ext.app.Controller',
    init: function() {
        this.control({
            // 'useredit > button#saveData': {
                'button[itemId=saveData]':{
                click: this.onSaveButtonClick
            }
        })
    },

    onSaveButtonClick: function(btn) {

        
        var grid=Ext.ComponentQuery.query('grid[itemId=oldList]')[0];
        var data= btn.up('form').getValues();
        grid.getSelectionModel().getSelection()[0].set(data);
        
        var selectedModule=grid.getSelectionModel().getSelection()[0];
        console.log(grid.getSelectionModel());
        console.log(selectedModule);
        console.log(data);
        console.log(grid);
        console.log(btn);
    }
});
