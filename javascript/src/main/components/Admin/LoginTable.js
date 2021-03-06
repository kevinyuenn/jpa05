import React from "react";
import BootstrapTable from 'react-bootstrap-table-next';

export default ({loginTable}) => {
    const columns = [{
        dataField: 'timestamp',
        text: 'Timestamp'
    }, {
        dataField: 'email',
        text: 'Email'
    }, {
        dataField: 'firstName',
        text: 'First Name'
    }, {
        dataField: 'lastName',
        text: 'Last Name'
    }];

    return (
        <BootstrapTable keyField='timestamp' data={loginTable} columns={columns} />
    );
}