
#import "RNSimInfo.h"
#import <CoreTelephony/CTTelephonyNetworkInfo.h>
#import <CoreTelephony/CTCarrier.h>

@implementation RNSimInfo

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(isSimCardValid:(RCTResponseSenderBlock)callback) {
    
    CTTelephonyNetworkInfo *info = [[CTTelephonyNetworkInfo init] alloc];
    CTCarrier *carrier = info.subscriberCellularProvider;
    
    BOOL isSimCardValid = carrier.mobileNetworkCode && ![carrier.mobileNetworkCode isEqualToString:@""];
    
    callback(@[[NSNumber numberWithBool:isSimCardValid]]);
}

@end
  
