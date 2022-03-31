import {
  requireNativeComponent,
  UIManager,
  Platform,
  ViewStyle,
} from 'react-native';

const LINKING_ERROR =
  `The package '@luxtudio/react-native-context-menu' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo managed workflow\n';

type ReactNativeContextMenuProps = {
  color: string;
  style: ViewStyle;
};

const ComponentName = 'ReactNativeContextMenuView';

export const ReactNativeContextMenuView =
  UIManager.getViewManagerConfig(ComponentName) != null
    ? requireNativeComponent<ReactNativeContextMenuProps>(ComponentName)
    : () => {
        throw new Error(LINKING_ERROR);
      };
