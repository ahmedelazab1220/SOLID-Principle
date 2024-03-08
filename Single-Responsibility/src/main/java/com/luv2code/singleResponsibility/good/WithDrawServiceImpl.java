package com.luv2code.singleResponsibility.good;

public class WithDrawServiceImpl implements WithDrawService {

	public long withDraw(long amount, String accountNo) {
		System.out.println("Please follow the established procedure for withdrawals as per our agreement.");
        // do some job
		return 0;
    }
}
