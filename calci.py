def calculate(expression):
    try:
        result = eval(expression)
        return result
    except Exception as e:
        return f"Error: {e}"

def calculator():
    print("Simple Calculator")
    print("Enter mathematical expressions to calculate (e.g., 2 + 3 * 4)")
    print("Type 'exit' to quit the calculator.\n")

    while True:

        expression = input("Enter expression: ")

        if expression.lower() == 'exit':
            print("Exiting the calculator.")
            break

        result = calculate(expression)

        print(f"Result: {result}\n")
        
calculator()
