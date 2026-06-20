DECLARE
    CURSOR vip_cur IS
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000;
BEGIN
    FOR vip_rec IN vip_cur LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = vip_rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'Customer ID ' || vip_rec.CustomerID ||
            ' promoted to VIP status.'
        );
    END LOOP;

    COMMIT;
END;
/