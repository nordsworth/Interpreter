package interpreter.bytecode.BopOperators;

import interpreter.VirtualMachine;
import interpreter.bytecode.BopCode;

public class MultiOperator extends BopCode {
    public void execute(VirtualMachine vm) {
        int a = vm.popStack();
        int b = vm.popStack();
        vm.pushStack(a * b);
    }

}