#ifdef RCT_NEW_ARCH_ENABLED
#import "ReactNativeContextMenuView.h"

#import <react/renderer/components/RNReactNativeContextMenuViewSpec/ComponentDescriptors.h>
#import <react/renderer/components/RNReactNativeContextMenuViewSpec/EventEmitters.h>
#import <react/renderer/components/RNReactNativeContextMenuViewSpec/Props.h>
#import <react/renderer/components/RNReactNativeContextMenuViewSpec/RCTComponentViewHelpers.h>

#import "RCTFabricComponentsPlugins.h"
#import "Utils.h"

using namespace facebook::react;

@interface ReactNativeContextMenuView () <RCTReactNativeContextMenuViewViewProtocol>

@end

@implementation ReactNativeContextMenuView {
    UIView * _view;
}

+ (ComponentDescriptorProvider)componentDescriptorProvider
{
    return concreteComponentDescriptorProvider<ReactNativeContextMenuViewComponentDescriptor>();
}

- (instancetype)initWithFrame:(CGRect)frame
{
  if (self = [super initWithFrame:frame]) {
    static const auto defaultProps = std::make_shared<const ReactNativeContextMenuViewProps>();
    _props = defaultProps;

    _view = [[UIView alloc] init];

    self.contentView = _view;
  }

  return self;
}

- (void)updateProps:(Props::Shared const &)props oldProps:(Props::Shared const &)oldProps
{
    const auto &oldViewProps = *std::static_pointer_cast<ReactNativeContextMenuViewProps const>(_props);
    const auto &newViewProps = *std::static_pointer_cast<ReactNativeContextMenuViewProps const>(props);

    if (oldViewProps.color != newViewProps.color) {
        NSString * colorToConvert = [[NSString alloc] initWithUTF8String: newViewProps.color.c_str()];
        [_view setBackgroundColor: [Utils hexStringToColor:colorToConvert]];
    }

    [super updateProps:props oldProps:oldProps];
}

Class<RCTComponentViewProtocol> ReactNativeContextMenuViewCls(void)
{
    return ReactNativeContextMenuView.class;
}

@end
#endif
