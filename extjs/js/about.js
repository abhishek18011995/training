Ext.onReady(function() {


    var panelTop = Ext.create("Ext.Panel", {
        title: "Welcome Kumar Abhishek",
        margin: '0 0 10 0',
        border: false,
        bodyStyle: {
            'background-color': '#666666',
        },
        // renderTo: Ext.getBody()

    });

    var panelBottom = Ext.create("Ext.Panel", {
        layout: {
            type: 'hbox',
        },
        // renderTo:Ext.getBody(),
        bodyStyle: {
            'background-color': '#666666',
        },
        margin: '0 0 10 0',
        border: false,
        items: [{
            layout: {
                type: 'vbox',
                align: 'stretch'
            },
            border: false,
            margin: '0 20 0 0',
            width: 450,
            height: 790,
            bodyStyle: {
                'background-color': '#666666',
            },
            // style: 'border: 1px solid red;',
            items: [{
                title: 'About Me',
                titleAlign: "center",
                icon: "img/edit2.png",
                iconCls: "icons1",
                bodyStyle: {
                    padding: '20px 30px'
                },
                flex: 2,
                // bodyStyle: {
                //     'color': 'red',
                // },
                margin: '0 0 10 0',
                data: {
                    id: "578296",
                    title: "Mr",
                    firstName: "Kumar",
                    lastName: "Abhishek",
                    middleInitial: "update",
                    doj: "18-Jan-1995",
                    bloodGrp: "O+"
                },
                tpl: [
                    "<p>Employee id : {id} </p>",
                    "<p>Title : {title}</p>",
                    "<p>First Name : {firstName}</p>",
                    "<p>Last Name : {lastName}</p>",
                    "<p>Middle Initial : {middleInitial}</p>",
                    "<p>Date Of Birth : {doj}</p>",
                    "<p>Blood Group : {bloodGrp}</p>"
                ]

            }, {
                title: 'Personal Email',
                icon: "img/edit2.png",
                iconCls: "icons1",
                titleAlign: "center",
                flex: 1,
                margin: '0 0 10 0',
                data: {
                	name: "xyz",
                	email:"abhishek18011995@gmail.com",
                	emailType:"PER1"
                },
                tpl: [
                    "<table>",
                    "<tr>",
                    "<td>Email Id</td>",
                   	"<td>Type</td>",
                   	"</tr>",
                   	"<tr>",
                    "<td>{email}</td>",
                   	"<td>{emailType}</td>",
                   	"</tr>",
                   	"</table>"
                ]

            }, {
                title: 'Emergency Contact',
                icon: "img/edit2.png",
                iconCls: "icons1",
                titleAlign: "center",
                margin: '0 0 10 0',
                html: 'Panel with flex 2',
                flex: 1
            }, {
                title: 'My Language Details',
                icon: "img/edit2.png",
                iconCls: "icons1",
                titleAlign: "center",
                html: 'Panel with flex 1',
                // margin: '0 0 10 0',
                flex: 1
            }]


        }, {
            flex: 5,
            border: false,
            bodyStyle: {
                'background-color': '#666666',
            },
            items: [{
                border: false,
                layout: {
                    type: 'vbox',
                    align: 'stretch'
                },
                height: 500,
                bodyStyle: {
                    'background-color': '#666666',
                },
                items: [{
                    title: "My Address",
                    icon: "img/edit2.png",
                    iconCls: "icons1",
                    titleAlign: "center",
                    margin: '0 0 10 0',
                    bodyStyle: {
                        padding: '20px 30px'
                    },
                    flex: 2,
                    layout: 'accordion',
                    width: 600,
                    items: [{
                        title: 'Panel 1',
                        html: 'Panel 1 html content'
                    }, {
                        title: 'Panel 2',
                        html: 'Panel 2 html content'
                    }, {
                        title: 'Panel 3',
                        html: 'Panel 3 html content'
                    }, {
                        title: 'Panel 4',
                        html: 'Panel 4 html content'
                    }, {
                        title: 'Panel 5',
                        html: 'Panel 5 html content'
                    }]
                }, {
                    layout: {
                        type: 'hbox',
                        align: 'stretch'
                    },
                    // margin: '0 0 0 0',
                    bodyStyle: {
                        'background-color': '#666666',
                    },
                    border: false,
                    flex: 1.5,
                    items: [{
                        title: 'Personal Phone',
                        icon: "img/edit2.png",
                        iconCls: "icons1",
                        bodyStyle: {
                            padding: '20px 30px'
                        },
                        titleAlign: "center",
                        margin: '0 20 0 0',
                        html: 'NO DATA AVAILABLE',
                        flex: 1
                    }, {
                        title: 'Work Phone',
                        html: 'NO DATA AVAILABLE',
                        iconCls: "icons1",
                        icon: "img/edit2.png",
                        bodyStyle: {
                            padding: '20px 30px'
                        },
                        titleAlign: "center",
                        // margin: '0 0 10 0',
                        flex: 1
                    }]
                }]
            }]
        }],
        // renderTo: Ext.getBody()

    });

    //main panel
    Ext.create("Ext.panel.Panel", {
        items: [panelTop, panelBottom],
        border: false,
        // padding:'0 10 0 10',
        bodyStyle: {
            'background-color': '#666666',
        },
        renderTo: Ext.getBody()
    });

});
