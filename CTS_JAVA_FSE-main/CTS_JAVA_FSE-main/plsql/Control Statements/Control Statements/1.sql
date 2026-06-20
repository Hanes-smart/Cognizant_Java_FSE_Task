DECLARE
    CURSOR cust_cur IS
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60;
BEGIN
    FOR cust_rec IN cust_cur LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust_rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'Applied 1% discount for Customer ID: ' ||
            cust_rec.CustomerID
        );
    END LOOP;

    COMMIT;
END;
