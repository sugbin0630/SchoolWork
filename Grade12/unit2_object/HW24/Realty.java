package Grade12.unit2_object.HW24;

public class Realty {
    public static void main(String[] args) {
        /*
         * Property
         *    o Fields: id, address, primSpec, secSpec
         *    o Methods:
         *      Constructor – initialize all fields
         *      matchProperty - returns whether this property matches the specified
         *          primary and secondary spec (with given matching percentage)
         *          toString – returns the id and address ONLY in organized format
         * • Condo – subclass of Property
         *    o Methods:
         * Constructor – initialize all fields
         * • House – subclass of Property
         *    o Methods:
         * Constructor – initialize all fields
         * • PrimarySpec
         *    o Fields: zoneCode, price, size, numBedRoom
         *    o Methods:
         * Constructor – initialize all fields
         * matchSpec - check if this primary spec matches the given primary spec
         * toString - Returns the value all of the specification in this object in an
         * organized format
         * • SecondarySpec - abstract class
         *    o Methods:
         * matchSpec – abstract method
         * • CondoSpec – subclass of SecondarySpec
         *    o Fields: pool, exRoom, locker, hydroIncluded, cableIncluded
         *    o Methods:
         * Constructor – initialize all fields
         * matchSpec - check if this condo spec matches the given percentage of
         * the given spec
         * toString - Returns the value all of the specification in this object in an
         * organized format
         * • HouseSpec – subclass of SecondarySpec
         *    o Fields: vacuum, ac, fireplace, hardwood, basement
         *    o Methods:
         * Constructor – initialize all fields
         * matchSpec - check if this condo spec matches the given percentage of
         * the given spec
         * toString - Returns the value all of the specification in this object in an
         * organized format
         * • PropertyDatabase
         *    o Fields: numProperty, list
         *    o Methods:
         * seachByID - return the Property object that has the specified ID, null if
         * not found
         * printAllMatch - Prints the list of properties (their ID and address) that
         * match the specified primary and secondary specification
         * averagePriceInZone - Returns the average price of all properties in
         * the specified zone
         * largestCondo - Returns the Condo object that has the largest size
         * • Realty
         *    o Methods:
         * main – display menu and perform actions according to user’s choice
         */
    }
}
