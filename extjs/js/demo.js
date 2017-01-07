Ext.onReady(function() {
    // console.log(Ext.Component);
    Ext.create("Ext.Panel", {
        title: "Panel1",
        html: "my first extjs program",
        border: 5,
        style: {
            borderColor: 'navyblue',
            borderStyle: 'solid'
        },
        height: 220,
        width: 500,
        buttons: [{ text: "save" }, { text: "cancel" }],
        renderTo: "div1"
    });
    Ext.create("Ext.Panel", {
        title: "Panel2",
        html: "my first extjs program",
        height: 520,
        width: 500,
        buttons: [{ text: "save" }, { text: "cancel" }],
        renderTo: "div1"
    });

    var component1 = Ext.create('Ext.Component', {
        html: 'First Component'
    });

    var component2 = Ext.create('Ext.Component', {
        html: 'Second Component'
    });

    var component3 = Ext.create('Ext.Component', {
        html: 'Third Component'
    });

    var container = Ext.create('Ext.container.Container', {
        // renderTo: Ext.getBody(),
        border: 1,
        width: '50%',
        style: { borderStyle: 'solid', borderWidth: '2px' },
        items: [component3]
    });

    Ext.create('Ext.container.Container', {
        renderTo: Ext.getBody(),
        title: 'Container',
        border: 1,
        width: '50%',
        style: { borderStyle: 'solid', borderWidth: '2px' },
        items: [component1, component2, container]
    });

    var childPanel1 = Ext.create('Ext.Panel', {
        title: "childPanel1",
        html: 'First Panel'
    });

    var childPanel2 = Ext.create('Ext.Panel', {
        title: "childPanel2",
        html: 'Another Panel'
    });

    Ext.create('Ext.panel.Panel', {
        renderTo: Ext.getBody(),
        width: 100,
        height: 100,
        border: true,
        frame: true,
        items: [childPanel1, childPanel2]
    });

    var child1 = Ext.create('Ext.Panel', {
        title: 'Child Panel 1',
        html: 'textfield'
    });

    var child2 = Ext.create('Ext.Panel', {
        title: 'Child Panel 2',
        html: 'Text field'
    });

    Ext.create('Ext.form.Panel', {
        renderTo: Ext.getBody(),
        width: 100,
        height: 100,
        border: true,
        frame: true,
        layout: 'auto', // auto is one of the layout type.
        items: [child1, child2]
    });

    // Ext.create('Ext.container.Viewport', {
    //       renderTo: 'Ext.getBody()',
    //           items: [ child1, child2 ]
    //       });

    Ext.create('Ext.tab.Panel', {
        renderTo: Ext.getBody(),
        height: 100,
        width: 200,
        items: [{
            xtype: 'panel',
            title: 'Tab One',
            html: 'The first tab',
            listeners: {
                render: function() {
                    Ext.MessageBox.alert('Tab one', 'Tab One was clicked.');
                }
            }
        }, {
            // xtype for all Component configurations in a Container
            title: 'Tab Two',
            html: 'The second tab',
            listeners: {
                render: function() {
                    Ext.MessageBox.alert('Tab two', 'Tab Two was clicked.');
                }
            }
        }]
    });

});
