DECLARE
    CURSOR loan_cur IS
        SELECT c.CustomerID,
               c.Name,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
          ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE
                            AND SYSDATE + 30;
BEGIN
    FOR loan_rec IN loan_cur LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || loan_rec.Name ||
            ', your Loan ID ' || loan_rec.LoanID ||
            ' is due on ' ||
            TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/