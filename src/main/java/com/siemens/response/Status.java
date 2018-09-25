package com.siemens.response;


public enum Status {
	//公有状态码信息
	LSucceed(1, "请求成功"), 
	LFailed(0,  "请求失败"),
	ERROR(-1,   "服务器异常"),
	NULL_PARAM(-4, "参数为空"), 
	NOT_LOCATE(-5, "用户未定位 "), 
	NETWORK_ERROR(-6,  "网络连接失败"),
	DATA_NULL(-9,   "数据为空"),
	NO_CACHE_USER(-10, "登录状态已失效，请重新登录"),
	NO_VERSION_SUPPORT(-11, "您当前的版本不支持此功能，请更新版本"),
	
    // 签名认证失败
    CHECK_SIGN(1001, "签名认证失败"),
    REQUEST_PARAM(1002, "请求业务参数不正确"),
    ERROR_VIRIFYCODE(1003,"验证码错误"),

	//用户模块错误码信息 以100开头
    NULL_USERNAME_PASSWORD(100001, "用户名或密码为空"),
    USED_USERNAME_MOBILE(100002, "用户名或手机号已被使用"),
    ERROR_USERNAME_PASSWORD(100003,"用户名或密码错误"),
    NO_OUT_USER(100004,"未激活第三方登录"),
    ERROR_PHONE(100005,"手机号码格式错误"),
    ERROR_EMAIL(100006,"邮箱格式错误"),
    ERROR_REFER_PHONE(100007,"推荐人手机号码错误"),
    ISUSED_PHONE(100008,"手机号已经被注册"),
    ISUSED_EMAIL(100009,"邮箱已经被注册"),
    ERROR_OLD_PASSWORD(100010, "旧密码错误"),
    ERROR_VALIDATE_CODE(100014,"错误的验证码"),
    OVERDUE_VALIDATE_CODE(100012,"验证码已过期，请重新获取"),
    NOTUSED_PHONE(100013,"手机号未注册"),
    QUICK_LOGIN_USER(100015,"快捷登录用户"),
    IMG_CODE_FAIL(100016,"图片验证失败"),
    NEED_IMG_CODE(100017,""),
    NULL_REGISTRATIONID(100018,"registrationId为空"),
    NEVER_BIND(100019,"没有绑定过"),
    NO_RED_PACKET_LEFT(100020,"红包被领完了"),
    NO_VOUCHER_LEFT(100021,"批次券发完了"),
    NONE_PUSH_IN_MANAGE(100023,"无此人员记录"),
    NOT_ENOUGH_INTEGRAL(100025,"积分不足"),
    EXCHANGE_TYPE_ERROR(100026,"兑换类型异常"),
    NONE_USER_EXT(100027,"不存在的第三方账号"),
    EXIT_USER_EXT(100028,"已存在的第三方登录"),
    ERROR_FROM_PHONE(100029,"邀请人手机号码格式错误"),//htt 2015-3-12 H5接受红包验证
    HAVE_BIND(100030,"已绑定该第三方"),//htt 2015-3-12 第三方账号绑定
    USER_NOT_FOUND(100031,"账户信息异常"),
    MOBILE_HAS_NOT_BIND(100032,"手机号未绑定"),
    ERROR_INVITE_USERINFO(100033,"邀请人信息异常"),
    PARAM_EMPTY_MOBILE(1000034, "手机号为空"),
    NOT_ENOUGH_OR_NO_LEFT(1000035,"券库存不足"),
    ERROR_CONTACTS_PHONE(10000036,"发卡联系人手机为空"),
    USED_CARDNO_MOBILE(10000037,"该卡号已经被绑定"),
    ERROR_NOBIND_CARD(100000038,"该账号未绑定VIP卡"),
    ERROR_ERP_OPERATION(100000039,"服务器后台操作错误"),
  //商店模块，以200开头
    NULL_SHOP_ID(200001,"shopId为空"),
    NULL_SHOP_PROD_TYPE_ID(200002, "商店的产品类别id为空"),
    NULL_OP_CODE(200003, "操作码为空"),
    BEFORE_BEGIN_TIME(200005, "还未开始"),
    AFTER_END_TIME(200006,"已经结束"),
    BEYOND_TIMES_LIMIT(200007, "超过次数限制"),
    //订单模块
    NULL_ORDER(300001,"订单不存在"),
    ORDER_NOT_BELONG_USER(300002,"该订单不属于此用户"),
    CAN_NOT_CANCEL(300003,"该订单暂时不能取消"),
    ERROR_ORDER_STATUE(300004,"订单状态错误"),
    ERROR_DELIVERY_METHOD(300005,"订单配送方式错误"),
    CONTAIN_CHINESE(300006,"收货人号码不能包含中文"),
    CAN_NOT_CHANGE_PAY_METHOD(300007,"该订单不能更改支付方式"),
    CREATE_ORDER_FAILED(300010,"创建订单失败"),
    NULL_PAY_METHOD_ACTIVITY(300011,"优惠活动不存在"),
    FINISHED_PAY_METHOD_ACTIVITY(300012,"优惠活动已结束"),
    CANNOT_BUY_WITHOUT_MOBILE(300013,"非手机绑定用户不能购买"),
    NO_ADDRESS(300014,"请先设置收货地址"),
    ERROR_GOODS(300015,"商品异常"),
    ERROR_GOODS_EVA(300016,"此订单商品已经评价"),
    ZERO_STOCK(300017,"商品卖完啦～"),
    ORDER_POINT_IS_USING(300018,"该账号正在别的设备使用积分"),
    CAN_NOT_REFUND(300019,"该订单暂时不能退货"),
    INTEGRAL_OPERA_FAILED(300020,"积分抵扣失败"),
    INTEGRAL_RETURN_FAILED(30021,"积分返还失败"),
    CAN_NOT_LOGITICS(300022,"暂无物流信息"),
    CAN_NOT_LOGITICS_2(300023,"暂无物流信息，请稍后再试，或到官网查询。"),
    
    //抵用券
    VOUCHER_CANNOT_USE(400001,"此优惠券不可用"),
    VOUCHER_NOT_GET(400002,"未领取此优惠券"),
    VOUCHER_NOT_FOUND(400003,"未找到此优惠券"),
    VOUCHER_DELIVERED(400004,"此优惠券已被绑定"),
    VOUCHER_CANN0T_BIND(400005,"此优惠券不支持绑定"),
    VOUCHER_BIND_ERROR(400006,"优惠券绑定失败"),
    VOUCHER_OVER_TIME(400007,"此优惠券已过期"),
    VOUCHER_ONLY_WEBSITE(400008,"此优用券只能在网站使用"),
    VOUCHER_ONLY_OLDUSER(400009,"此优用券限老用户使用"),
    VOUCHER_ONLY_NEWUSER(400010,"此优用券限新用户使用"),
    VOUCHER_FOR_PUBLIC(400011,"此公用优惠券不可用"),
    VOUCHER_FOR_ONLY(400012,"此优惠券活动期内限领一张"),
    VOUCHER_FOR_ONLY_DAY(400013,"此优惠券活动期内每天限领一张"),

    VOUCHER_RETURN_SUCCESS(410000,"优惠券返还成功"),
    VOUCHER_RETURN_REQUEST_ERROR(410001,"优惠券返还失败"),
    VOUCHER_RETURN_PARAM_ERROR(410002,"优惠券返还接口请求参数错误"),
    VOUCHER_RETURN_NO_EXIST(410003,"优惠券不存在"),
    ERROR_LECARD_NO(410004,"卡号不存在"),
    ERROR_EXPIRED_LECARD(410005,"卡已过期"),
    ERROR_LECARD_EXIST(410006,"此手机号已开通会员，请勿重复申请"),
    ERROR_LECARD_PAY_AMOUNT(410007,"支付金额不正确"),
    ERROR_LECARD_GBF(410008,"工本费获取失败"),
    ERROR_CANCEL_LECARD(410009,"卡已作废"),

    //店铺商品相关
    NULL_GOODS(500000,"商品不卖了"),
    NULL_SHOP(500001,"店铺不存在"),
    COLLECTED(500002,"已收藏"),
    NOT_COLLECTED(500003,"未收藏"),
    BEYOND_AREA(500004,"超出该店铺配送范围"),
    UNDER_CARRIAGE(500005,"该商品已下架"),
    S_NULL_PRODUCT(500006,"搜索商品不存在"),

    S_ERROR_RETURN(500007,"搜索返回参数异常"),

    NOT_SELECT_DELIVERY(500008,"未选择配送方式"),
    NO_SHOPID(500009, "shopId为空 "),
    ADDRESS_NO_LOCATE(500010, "地址未定位 "),
    NULL_PRODUCT(500011,"未找到该商品"),
    NO_DELIVERY_METHOD(510000,"没有对应的配送方式"),
    SHOP_NOT_IN_BUSINESS(510001,"店铺已打烊"),

    //其他
    BANK_HAS_REGISTER(600001,"已经登记过"),


    //特权 奖励 领取
    HAVE_GOT_ONE(800001,"亲,已经领取过了 不能重复领喔"),
    HAVE_GOT_THIS_WEEK(800002,"亲,本周已经领取过了,下周再来啦~"),
    HAVE_GOT_THIS_MONTH(800003,"亲,本月已经领取过了,下月再来啦~"),

    // 恶意用户
    BLACK_USER(900001,"你已经被列入黑名单，请联系客服"),

    // 囤券大作战
    SPOT_BATTLE_SHARED(1000001,"亲,您今日已经分享过了,明天再来啦~"),
    SPOT_BATTLE_UNPLAY(1000002,"亲,您今日还没有进行囤劵大作战游戏哦~"),
    SPOT_BATTLE_UNRECORD(1000003,"亲,未查询到的您的unionid记录~"),
    SPOT_BATTLE_NOGIFT(1000004,"亲,您的段数残的厉害，木有奖品哦~"),
    SPOT_BATTLE_WEAK(1000005,"亲,您今日游戏机会已用完,明天再来吧~"),
    SPOT_BATTLE_OPPORTUNITY(1000006,"亲,您可以分享来获取一次游戏机会哦~"),
    SPOT_BATTLE_CHEAT(1000007,"亲,您的段数已经超越宇宙啦,确定是人类在玩耍么~"),
    SPOT_BATTLE_BIND_ALREADY(1000008,"亲~满60减10券不可重复领取哦~"),
    SPOT_BATTLE_BIND_OUTSIDE(1000009,"亲,您今日绑定券的次数太多了哦~"),

    // 抢券活动
    COUPONRUSH_SHOP_NOT_INVOLVED(1100001,"亲,该店铺不参与活动哦~"),
    COUPONRUSH_OUT_USER_ACT_TODAY_NUM(1100002,"亲,您今天活动优惠券的领取数已达上限哦~"),
    COUPONRUSH_OUT_USER_ACT_PERIOD_NUM(1100003,"亲,您活动优惠券的总领取数已达上限哦~"),
    COUPONRUSH_RUSH_NOT_EXIST(1100004,"亲,您当前的活动不存在哦~"),
    COUPONRUSH_COUPON_NOT_EXIST(1100005,"亲,您当前的优惠券不存在哦~"),
    COUPONRUSH_OUT_USER_TASK_TODAY_NUM(1100006,"亲,您今日已经领取该优惠券啦，明天再来吧~"),
    COUPONRUSH_OUT_TASK_TODAY_NUM(1100007,"亲,该优惠券今日领取人数已达上限啦，明天赶早哦~"),
    COUPONRUSH_COUPON_TASK_NONE(1100008,"亲,该批次优惠券已经被领光啦，看看其他优惠券吧~"),
    COUPONRUSH_COUPON_RECEIVE_FAILURE(1100009,"亲,优惠券领取失败，请重试一下吧~"),
    COUPONRUSH_UNPLAY_TODAY(1100010,"亲,您今日还没有玩闯关游戏哦~"),
    COUPONRUSH_BATTLE_WEAK(1100011,"亲,您今日游戏机会已用完,明天再来吧~"),
    COUPONRUSH_BATTLE_OPPORTUNITY(1100012,"亲,您可以分享来获取一次游戏机会哦~"),
    COUPONRUSH_BATTLE_CHEAT(1100013,"亲,游戏数据异常，请联系我们吧~"),
    COUPONRUSH_BATTLE_SHARED(1100014,"亲,您今日已经分享过了,明天再来啦~"),
    COUPONRUSH_BATTLE_BIND_OUTSIDE(1100015,"亲,您今日绑定券的次数太多了哦~"),
    COUPONRUSH_OUT_USER_VOUCHER_TASK_PERIOD_NUM(1100016,"亲,您的该批次优惠券领取数已经达到上限啦~"),
    COUPONRUSH_OUT_USER_GRADE(1100017,"亲,您的会员等级未达到参与条件,看看其他优惠券吧~"),

    BEFORE_EXCHANGE_START_TIME(1200001,"亲，现在不在兑换时间内，先看看其他吧~"),
    NULL_EXCHANGE_POINTS_ITEM(1200002,"亲，您兑换的物品不见啦，看看其他的吧~"),
    AFTER_EXCHANGE_END_TIME(1200003,"亲，您来晚了，优惠券已过期~"),

    // 积分商城
    OUT_OF_STOCK(1300001,"亲，您兑换的物品已经被兑换完啦，看看其他的吧~"),

    NEW_USER_BIND_VOUCHER_NOT_NEW_USER(1400000,"非新用户状态"),
    NEW_USER_BIND_VOUCHER_HAD_BIND(1400001,"已领取过券"),

	//购物车，200开头
	CART_ADD_FAILED(200001, "购物车添加失败"),
    CART_REDUCE_FAILED(200002,"购物车减少数量失败"),
    NULL_CART_ITEM(200004, "购物车条目为空"),
    NOT_ENOUGH_QTY(200005,"商品卖完啦～"),
    INVALID_GOODS_STATUS(200006,""),
    CART_ALL_GOODS_INVALID(200007,"商品卖完啦～"),
    NOT_ENOUGH_QUOTA(200008,""),
    // 抽奖活动，1500开头
    LUCK_ACTIVITY_CURRENT_NULL(1500001, "当前没有抽奖活动"), 
    LUCK_ACTIVITY_DRAWED(1500002, "亲，您今天抽奖次数已达上限"),
    LUCK_ACTIVITY_ILEGAL(1500004, "抽奖活动无效或已过期"),
    PRIZE_NULL(1500005, "奖品信息不存在"),
    LUCK_ACTIVITY_MODIFIED(1500006, "抽奖活动信息已发生变化"),

    //
    GOODS_QTY_CHANGED(1700001,"库存有变动~ "),
	//限时购活动 1600开头
	SECKILL_NUMBER_SUCCESS(160000,"扣减库存成功"),
	SECKILL_NUMBER_FAIL(160001,"扣减库存失败"),
	SECKILL_NUMBER_EXCEPTION(160002,"扣减库存异常"),
	
	//第三方登录1700开头
	THIRD_PARTY_LOGIN_BIND(170001,"该平台账号已绑定，请先解绑"),
	THIRD_PARTY_LOGIN_UNBIND(170002,"未绑定第三方账号"),
	THIRD_PARTY_UNBIND_EXCEPTION(170003,"绑定当前账号异常"),
	THIRD_PARTY_AUTHORIZE_EXCEPTION(170004,"授权失败");
	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;

	private Status(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public Status getStatus(int index) {
		switch (index) {
		case 1:
			return Status.LSucceed;
		case 0:
			return Status.LFailed;
		default:
			return Status.ERROR;
		}
	}
	
}
