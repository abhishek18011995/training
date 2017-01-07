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

        var form=Ext.ComponentQuery.query('form[name=newForm]')[0];
        // console.log(form);
        // console.log(form.down('form'));
        form.down('form').loadRecord(e);

// var uForm = Ext.create('widget.useredit');
// console.log(uForm);
// console.log(uForm.down('form'));


    
 
    }
});
