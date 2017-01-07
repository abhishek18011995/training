Ext.define('AM.view.UpdateForm', {
    extend: 'Ext.form.Panel',
    alias: 'widget.useredit',
    border:false,
    title: 'Edit User',
    layout: 'fit',
    autoShow: true,
name:'newForm',
    initComponent: function() {
        this.items = [{
            xtype: 'form',
            items: [{
                xtype: 'textfield',
                name: 'name',
                fieldLabel: 'Name'
            }, {
                xtype: 'textfield',
                name: 'email',
                fieldLabel: 'Email'
            }
            // , {
            //     xtype:'button',
            //     text: 'Save',
            //     action: 'save',
            //     defaultAlign:'south'
            // }, {
            //     xtype:'button',
            //     text: 'Cancel',
            //     scope: this,
            //     handler: this.close
            // }
            ]
        }];

        this.buttons = [{
            text: 'Save',
            action: 'save',
            itemId : 'saveData'
        }, {
            text: 'Cancel',
            scope: this,
            handler: this.close
        }];

        this.callParent(arguments);
    }
});
