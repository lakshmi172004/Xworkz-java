class SuperMarket{
  public static void main(String[] mart){
	String groceries[] = {"Rice","Wheat","Ragi","Sugar","Salt","Moongdal","Peanut","Channa","Wheat Flour","Masoor Dal","Poha","Rava","maida","Gram Flour","Corn Flour","Oats","Rice Flour","Jowar Flour","Barley","Pink Salt","Jaggery","Brown Rice","Rajma","Millet Mix","Ragi Flour"};
	String snacks[] = {"Potato chips","Banana Chips","Mixture","Sev","Chakli","kodbale","Roasted Peanuts","Roasted channa","Popcorn","Nachos","Cheese balls","Corn puffs","Moong dal snack","Kachori","Kurkure","Pakoda","French fries","Lays","Smiles","Nipattu","Corn masala","Doritos","Aloo Sticks","Samosa Sticks","Peanut masala"};
	String biscuits[] = {"Marie","Cream biscuits","Butter cookies","Salted biscuits","chocolate cookies","Oats biscuits","Milk biscuits","Wheat biscuits","Honey biscuits","Cheese biscuits","Rusk","Multigrain biscuits","Gooday","Sugar free biscuits","Almond cookies","Fruit biscuits","vanilla cookies","Chocochip cookies","Wafers","Sandwich biscuits","Cream wafers","Digestive biscuits","Coconut biscuits","Cashew Cokkies","Pista Cookies"};
	String beverages[] = {"Tea powder","Coffee powder","Green tea","Black tea","Herbal tea","Instant Coffee","Energy drinks","Filter coffee","Soft drinks","fruit juices","Milshake","Health drinks","Lemon tea","Coconut water","Ice tea","Soda","Cold coffee","Hot chocolate","flavoured water","Malt","Rose Syrup","Buttermilk","Lassi","Milk","Badam milk"};
	String dairyProducts[] = {"Milk","Curd","Butter","Cheese","Paneer","Ghee","Cream","Buttermilk","Flavoured milk","Yogurt","Lassi","Milk powder","Condensed milk","Whipping cream","Cheese slices","Cheese cubes","Ice cream","Frozen dessert","Milkshake bottles","Fresh cream","Low-fat milk","Skimmed milk","Flavoured yogurt","Cheese spread","Dairy whitener"};
	String oils[] = {"Sunflower Oil","Groundnut Oil","Soybean Oil","Mustard Oil","Coconut Oil","Olive Oil","Rice Bran Oil","Palm Oil","Cottonseed Oil","Sesame Oil","Vanaspati","Desi Ghee","Cow Ghee","Buffalo Ghee","Low Fat Oil","Refined Oil","Cold Pressed Oil","Blended Oil","Canola Oil","Avocado Oil","Flaxseed Oil","Corn Oil","Walnut Oil","Almond Oil","Organic Oil"};
	String spices[] = {"Turmeric","Red Chilli","Coriander","Cumin","Mustard Seeds","Pepper","Garam Masala","Chaat Masala","Sambar Powder","Rasam Powder","Pav Bhaji Masala","Biryani Masala","Kitchen King","Cardamom","Cloves","Cinnamon","Bay Leaf","Fennel","Fenugreek","Asafoetida","Dry Ginger","Nutmeg","Mace","Star Anise","Kasuri Methi"};
	String bakeryItems[] = {"Bread","Brown Bread","White Bread","Buns","Pav","Cake","Muffins","Cupcakes","Pastries","Swiss Roll","Donuts","Fruit Cake","Plum Cake","Tea Cake","Pizza Base","Burger Buns","Garlic Bread","Rusk","Croissant","Cookies","Brownies","Toast","Multigrain Bread","Sandwich Bread","Sponge Cake"};
	String chocolates[] = {"Milk Chocolate","Dark Chocolate","White Chocolate","Chocolate Bar","Eclairs","Toffee","Lollipop","Gummies","Jellies","Candies","Caramel Chocolate","Fruit Candy","Mint Candy","Wafer Chocolate","Chocolate Biscuit","Chocolate Spread","Fudge","Truffle","Sugar Candy","Gift Chocolate","Ladoo","Barfi","Halwa","Jalebi","Indian Sweets"};
	String frozenItems[] = {"Frozen Peas","Frozen Corn","Frozen Beans","Frozen Carrots","Frozen Paratha","Frozen Naan","Frozen Samosa","Frozen Cutlets","Frozen Fries","Frozen Nuggets","Frozen Momos","Frozen Idli","Frozen Dosa","Frozen Pizza","Frozen Paneer","Frozen Veg Mix","Frozen Fish","Frozen Chicken","Frozen Kebabs","Frozen Spring Rolls","Frozen Berries","Frozen Strawberries", "Frozen Rasgulla","Frozen Gulab Jamun","Frozen Desserts"};
	String fruits[] = {"Apple","Banana","Orange","Mango","Grapes","Pineapple","Papaya","Watermelon","Muskmelon","Guava","Pomegranate","Strawberry","Kiwi","Pear","Plum","Cherry","Peach","Apricot","Fig","Custard Apple","Litchi","Dragon Fruit","Avocado","Blueberry","Raspberry"};
    String vegetables[] = {"Potato","Tomato","Onion","Carrot","Beetroot","Cabbage","Cauliflower","Brinjal","Lady Finger","Beans","Peas","Cucumber","Pumpkin","Bottle Gourd","Ridge Gourd","Bitter Gourd","Drumstick","Radish","Turnip","Spinach","Fenugreek Leaves","Coriander Leaves","Mint Leaves","Sweet Corn","Capsicum"};
    String personalCares[] = {"Soap","Shampoo","Conditioner","Face Wash","Toothpaste","Toothbrush","Hair Oil","Body Lotion","Face Cream","Talcum Powder","Perfume","Deodorant","Hair Gel","Face Scrub","Sunscreen","Hand Wash","Sanitizer","Lip Balm","Shaving Cream","Razor","Hair Serum","Face Mask","Eye Cream","Body Wash","Bath Sponge"};
    String householdCleanings[] = {"Detergent Powder","Detergent Liquid","Dish Wash Bar","Dish Wash Liquid","Floor Cleaner","Toilet Cleaner","Phenyl","Bleach","Fabric Softener","Glass Cleaner","Room Freshener","Insect Repellent","Mosquito Coil","Mop","Broom","Cleaning Cloth","Scrubber","Steel Cleaner","Drain Cleaner","Car Cleaner","Dusting Spray","Hand Gloves","Garbage Bags","Air Freshener","Shoe Cleaner"};
    String kitchenUtensils[] = {"Plate","Bowl","Spoon","Fork","Knife","Pan","Tawa","Pressure Cooker","Kadai","Saucepan","Ladle","Spatula","Chopping Board","Peeler","Grater","Strainer","Lunch Box","Water Bottle","Flask","Mixer Jar","Gas Lighter","Measuring Cup","Rolling Pin","Tea Strainer","Idli Stand"};
    String homeCareProducts[] = {"Bedsheet","Pillow Cover","Curtains","Doormat","Blanket","Towel","Bath Mat","Cushion","Mattress Protector","Table Cloth","Laundry Basket","Storage Box","Hanger","Iron Stand","Shoe Rack","Cloth Clips","Wardrobe Organizer","Curtain Rod","Plastic Stool","Dustbin","Laundry Bag","Sofa Cover","Bed Cover","Mosquito Net","Door Mat"};
    String babyCares[] = {"Baby Soap","Baby Shampoo","Baby Oil","Baby Powder","Baby Lotion","Diapers","Wet Wipes","Baby Cream","Baby Towel","Baby Feeding Bottle","Baby Food","Baby Cereal","Baby Toothbrush","Baby Toothpaste","Baby Soap Case","Baby Nail Cutter","Baby Comb","Baby Pillow","Baby Blanket","Baby Bib","Baby Napkins","Baby Body Wash","Baby Moisturizer","Baby Sunscreen","Baby Cotton"};
    String healthCares[] ={"Vitamins","Protein Powder","Health Drinks","Energy Bars","Herbal Supplements","Glucose Powder","ORS","Ayurvedic Medicine","Pain Relief Spray","First Aid Kit","Bandage","Cotton","Thermometer","BP Monitor","Face Mask","Hand Gloves","Digital Scale","Hot Water Bag","Inhaler","Antiseptic Liquid","Hand Sanitizer","Protein Cookies","Fiber Supplement","Immunity Booster","Calcium Tablets"};
    String stationeries[] ={"Pen","Pencil","Eraser","Sharpener","Notebook","Drawing Book","Sketch Pen","Crayons","Highlighter","Marker","Stapler","Staple Pins","Paper Clips","File Folder","Calculator","Ruler","Glue Stick","Scissors","Sticky Notes","White Board","Board Marker","Correction Pen","Chart Paper","Envelope","Index Cards"};
    String clothingAndAccessories[] = {"T-Shirt","Shirt","Jeans","Trousers","Kurti","Leggings","Saree","Dupatta","Jacket","Sweater","Innerwear","Socks","Handkerchief","Cap","Scarf","Belt","Wallet","Handbag","Backpack","Footwear","Slippers","Sandals","Shoes","Raincoat","Umbrella"};
		System.out.println("The items in Super market are:");
	for(String grocery : groceries){
		System.out.println(grocery);
	}
		System.out.println("The items in snacks are:");
	for(String snack : snacks){
		System.out.println(snack);
	}
		System.out.println("The items in biscuits are:");
	for(String biscuit : biscuits){
		System.out.println(biscuit);
	}
		System.out.println("The items in beverages are:");
	for(String beverage : beverages){
		System.out.println(beverage);
	}
		System.out.println("The items in dairyProducts are:");
	for(String dairyProduct : dairyProducts){
		System.out.println(dairyProduct);
	}
		System.out.println("The items in oils are:");
	for(String oil : oils){
		System.out.println(oil);
	}
		System.out.println("The items in spices are:");
	for(String spice  : spices){
		System.out.println(spice);
	}
		System.out.println("The items in beverages are:");
	for(String bakeryItem  : bakeryItems){
		System.out.println(bakeryItem);
	}
		System.out.println("The items in chocolates are:");
	for(String chocolate  : chocolates){
		System.out.println(chocolate);
	}
		System.out.println("The items in frozenItems are:");
	for(String frozenItem  : frozenItems){
		System.out.println(frozenItem);
	}
		System.out.println("The items in fruits are:");
	for(String fruit : fruits){
		System.out.println(fruit);
	}
		System.out.println("The items in beverages are:");
	for(String vegetable : vegetables){
		System.out.println(vegetable);
	}
		System.out.println("The items in personalCares are:");
	for(String personalCare : personalCares){
		System.out.println(personalCare);
	}
		System.out.println("The items in householdCleanings are:");
	for(String householdCleaning : householdCleanings){
		System.out.println(householdCleaning);
	}
		System.out.println("The items in kitchenUtensils are:");
	for(String kitchenUtensil : kitchenUtensils){
		System.out.println(kitchenUtensil);
	}
		System.out.println("The items in homeCareProducts are:");
	for(String homeCareProduct : homeCareProducts){
		System.out.println(homeCareProduct);
	}
		System.out.println("The items in babyCares are:");
	for(String babyCare : babyCares){
		System.out.println(babyCare);
	}
		System.out.println("The items in healthCares are:");
	for(String healthCare : healthCares){
		System.out.println(healthCare);
	}
		System.out.println("The items in beverages are:");
	for(String stationerie : stationeries){
		System.out.println(stationerie);
	}
		System.out.println("The items in clothingAndAccessories are:");
	for(String clothingAndAccessorie : clothingAndAccessories){
		System.out.println(clothingAndAccessorie);
	}
	
  }
}