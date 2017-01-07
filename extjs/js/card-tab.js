Ext.onReady(function() {

    var count = 0;

    var panelTop = Ext.create("Ext.Panel", {
        title: "Welcome Kumar Abhishek",
        margin: '0 0 10 0',
        border: false,
        bodyStyle: {
            'background-color': '#666666',
        },
        // renderTo: Ext.getBody()

    });

    var panel = Ext.create("Ext.tab.Panel", {
        title: "Welcome Kumar Abhishek",
        bodyStyle: {
            'padding-top': '10px',
            'background-color': '#666666',
        },
        height: 1200,
        // width: 1100,
        tabPosition: "left",
        border: false,
        items: [{
                title: "Home",
                layout: {
                    type: 'vbox',
                    align: 'stretch'
                },
                bodyStyle: {
                    'background-color': '#666666',
                },
                border: false,
                items: [{
                    layout: "hbox",

                    bodyStyle: {
                        'background-color': '#666666',
                    },
                    border: false,
                    items: [{
                        title: "My Profile Completeness",
                        titleAlign: 'center',
                        flex: 5,
                        margin: '0 10 10 0',
                        height: 225,
                    }, {
                        title: "Certify Your Data",
                        flex: 2,
                        titleAlign: 'center',
                        height: 225,
                    }],

                }, {
                    layout: "hbox",
                    border: false,
                    bodyStyle: {
                        'background-color': '#666666',
                    },
                    items: [{
                        title: "Your Circle",
                        flex: 2,
                        titleAlign: 'center',
                        margin: '0 10 10 0',
                        height: 225,
                    }, {
                        title: "People You Must know",
                        titleAlign: 'center',
                        flex: 5,
                        height: 225,
                    }],
                }, {
                    title: "Disclaimer",
                    titleAlign: 'center',
                    height: 225,
                }],
            },

            // about me panel
            {
                title: "About Me",
                border: false,
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
                            email: "abhishek18011995@gmail.com",
                            emailType: "PER1"
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

            },
            // My Cognizant
            {
                title: "Panel 3",
                cls: 'panel-transform',
                layout: {
                    type: 'hbox'
                },
                bodyStyle: {
                    'background-color': '#666666',
                },
                border: false,
                items: [{
                    flex: 2,
                    border: false,
                    bodyStyle: {
                        'background-color': '#666666',
                    },
                    layout: {
                        type: 'vbox',
                        align: 'stretch'
                    },
                    margin: '0 10 0 0',
                    items: [{
                        title: 'My Project',
                        height: 140,
                        margin: '0 0 20 0',
                        bodyStyle: {
                            'padding': '20px 0px 0px 20px'
                        },
                        html: '<table border="1|0" id="table1"><tr><td>Project Id</td><td>Project Name</td></tr><tr><td>1000101010</td><td>HYD PAT CAT</td></tr></table>'
                    }, {
                        title: 'My Location',
                        height: 240,
                        margin: '0 0 20 0',
                        data: {
                            sezLoc: "GUR-TKR-SEZ",
                            seatNo: "TR191023839",
                            locName: "Tikri Bld (TKR)"
                        },
                        bodyStyle: {
                            'padding': '20px 0px 0px 20px',
                        },
                        tpl: [
                            '<p>Sez Location : {sezLoc}</p>',
                            '<p>Seat Number : {seatNo}</p>',
                            '<p>Location Name : {locName}</p>'
                        ]
                    }, {
                        title: 'My Role History',
                        height: 200,
                        margin: '0 0 20 0',
                    }, {
                        title: 'Billing Details',
                        height: 140,
                        margin: '0 0 0 0',
                    }]
                }, {
                    flex: 5,
                    bodyStyle: {
                        'background-color': '#666666',
                    },
                    border: false,
                    layout: {
                        type: 'vbox',
                        align: 'stretch'
                    },
                    items: [{
                        title: 'My Cognizant',
                        height: 420,
                        margin: '0 0 20 0',
                        data: {
                            email: "abhishek@gmail.com",
                            onsite: "OF",
                            job: "BUS",
                            bu: "IT Services",
                            assignedFrom: "18-JUL-2016",
                            jobCode: "80CA00"
                        },
                        bodyStyle: {
                            'padding': '20px 0px 0px 20px',
                        },
                        tpl: [
                            '<table id="table2">',
                            '<tr><td>Email Id : </td>', '<td>{email}</td></tr>',
                            '<tr><td>Onsite/Offsite : </td>', '<td>{onsite}</td></tr>',
                            '<tr><td>Job Function :  </td>', '<td>{job}</td></tr>',
                            '<tr><td>BU Name : </td>', '<td>{bu}</td></tr>',
                            '<tr><td>Supervisor Name : </td>', '<td>{assignedFrom}</td></tr>',
                            '<tr><td>Job Code : </td>', '<td>{jobCode}</td></tr>',
                            '</table>'
                        ]
                    }, {
                        title: 'My Competency',
                        height: 140,
                        margin: '0 0 20 0',
                        html: 'NO DATA AVAILABLE',
                        bodyStyle: {
                            'padding': '20px 0px 0px 20px',
                            'color': '#3399cc'
                        },
                    }, {
                        title: 'My Assignments',
                        height: 180,
                        margin: '0 0 20 0',
                        tpl: [

                        ]
                    }, {
                        layout: {
                            type: 'hbox',
                            align: 'stretch'
                        },
                        border: false,
                        bodyStyle: {
                            'background-color': '#666666',
                        },
                        items: [{
                            title: 'Assignment History',
                            height: 140,
                            flex: 2,
                            margin: '0 20 0 0'
                        }, {
                            title: 'Future Assignment',
                            height: 140,
                            flex: 2,
                        }]
                    }]
                }],
            }
        ],
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


    var mainPanel = Ext.create("Ext.panel.Panel", {
        items: [panel],
        border: false,
        // padding:'0 10 0 10',
        bodyStyle: {
            'background-color': '#666666',
        },
        renderTo: Ext.getBody()
    });

});
