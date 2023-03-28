import * as React from 'react';

import { StyleSheet, View } from 'react-native';
import { ReactNativeContextMenuView } from '@luxtudio/react-native-context-menu';

export default function App() {
  return (
    <View style={styles.container}>
      <ReactNativeContextMenuView color="#32a852" style={styles.box} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
