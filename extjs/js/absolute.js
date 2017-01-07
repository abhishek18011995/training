Ext.onReady(function() {


    var panel = Ext.create("Ext.Panel", {
        title: "Welcome Kumar Abhishek",
        margin: '0 0 10 0',
        html: "this is my panel",
        height: 250,
        width: 450,
        bbar: [
            { xtype: 'button', text: 'Button 1' }
        ],
        layout: "absolute",
        x: 100,
        y: 100,
        // bodyStyle: {
        //     'background-color': '#666666',
        // },
        renderTo: Ext.getBody()
    });

    var count = 0,
        het = window.innerHeight,
        fwd = true,
        type = "add";

    setInterval(function() {
        switch (type) {
            case "add":
                count = count + 10;
                break;
            case "minus":
                count = count - 10;
                break;
        }

        panel.setX(count);
        panel.setY(count);

        if (count > het && fwd) {
            type = "minus";
            fwd = false;
        }
        if (count < 10) {
            type = "add";
            fwd = true;
        }
    }, 100);

});
