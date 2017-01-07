Ext.onReady(function() {

    var count = 0;

    var panel = Ext.create("Ext.panel.Panel", {
        title: "Welcome Kumar Abhishek",
        html: "this is my panel",
        height: 250,
        width: 400,
        layout: "card",
        renderTo: Ext.getBody(),
        items: [{
            title: "Panel 1",
            html: "Panel 1"
        }, {
            title: "Panel 2",
            html: "Panel 2"
        }, {
            title: "Panel 3",
            html: "Panel 3"
        }, {
            title: "Panel 4",
            html: "Panel 4"
        }],
        buttons: [{
            text: "Prev",
            disabled: true,
            listeners: {
                click: function() {
                    if (count == 1) {
                        count = count - 1;
                        panel.getLayout().setActiveItem(count);
                        this.nextSibling().setDisabled(false);
                        this.setDisabled(true);
                    } else {
                        count = count - 1;
                        panel.getLayout().setActiveItem(count);
                        this.nextSibling().setDisabled(false);
                    }

                }
            }
        }, {
            text: "Next",
            // disabled: true,
            listeners: {
                click: function() {
                    if (count == 2) {
                        count = count + 1;
                        this.setDisabled(true);
                        panel.getLayout().setActiveItem(count);
                        this.previousSibling().setDisabled(false);

                    } else {
                        count = count + 1;
                        panel.getLayout().setActiveItem(count);
                        this.previousSibling().setDisabled(false);
                    }

                }
            }
        }]

    });
});

    