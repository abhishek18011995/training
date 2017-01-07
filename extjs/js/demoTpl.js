Ext.onReady(function() {

    var tempData= {
    	 name: "Abhishek",
            comp: "CTS"
    };

    Ext.create("Ext.Panel", {

        title: "My Panel",
        "data": {
            name: "abhi",
            comp: "cts"
        },
        tpl: [
            "<h1>Details</h1>",
            "<p>{name}</p>",
            "<p>{comp}</p>"
        ],
        tbar: [
  { xtype: 'button', text: 'Button 1' }
],
        tools: [{
            type: "refresh",
            handler: function(event, toolEl, panel) {
                this.up("panel").update(tempData);
            }
        }],
        renderTo: "div1"
    });
});
