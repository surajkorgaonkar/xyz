package proxy_pattern;

public class remoteobj implements proxyinterface {
	tvobj  newtv=  new tvobj();
	public void opertion() {
		// TODO Auto-generated method stub
		//tvobj  newtv=  new tvobj();
		System.out.println("following are the operations  perform by  remote ");
		this.channelup();
		this.channeldown();
		this.voldown();
		this.volup();
		this.poweron();
		this.poweroff();
	}

	@Override
	public void channelup() {
		// TODO Auto-generated method stub
		newtv.channelup();
	}

	@Override
	public void channeldown() {
		// TODO Auto-generated method stub
		newtv.channeldown();
	}

	@Override
	public void volup() {
		// TODO Auto-generated method stub
		newtv.volup();
	}

	@Override
	public void voldown() {
		// TODO Auto-generated menewtv.voldown();
		newtv.voldown();
	}

	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		newtv.poweron();
	}

	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		newtv.poweroff();
	}

}
