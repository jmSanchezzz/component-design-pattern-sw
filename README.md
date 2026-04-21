# Restaurant Menu Composite Pattern

Java implementation of the Composite Design Pattern for a restaurant Point-of-Sale (POS) menu. The project models both individual menu items and grouped menu categories using one shared component interface.

## Overview
Digital menus are often hierarchical. A menu can contain single items, combo meals, and nested bundles. This project demonstrates how to represent that hierarchy cleanly so pricing and printing work the same way for leaves and composites.

## Design
- `MenuComponent` defines the common operations:
	- `getPrice()` returns the computed price.
	- `print()` displays the menu entry.
- `MenuItem` is the leaf node for individual items with fixed price.
- `MenuCategory` is the composite node that holds child `MenuComponent` entries and computes total price by summing child prices.

## Current Demo Setup
The app builds this structure:
- Main Menu
- Barkada Solo Meal
- Classic Burger: ₱250.00
- Large Fries: ₱85.00
- Root Beer: ₱60.00
- Vanilla Sundae: ₱45.00

The total menu value printed by the app is ₱440.00.

## Project Files
- `MenuComponent.java` - component interface
- `MenuItem.java` - leaf implementation
- `MenuCategory.java` - composite implementation
- `RestoApp.java` - client/demo application

## Run
Compile and run from the project root:

```bash
javac *.java
java RestoApp
```
