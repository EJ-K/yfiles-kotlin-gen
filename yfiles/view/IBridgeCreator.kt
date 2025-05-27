// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Allows to add bridge visualizations to a [GeneralPath].
 * @see [BridgeManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBridgeCreator">Online Documentation</a>
 */
external interface IBridgeCreator : YObject {
/**
 * Called by the [BridgeManager] if the [getCrossingStyle] method yields [BridgeCrossingStyle.CUSTOM] to actually insert a bridge into the given [GeneralPath].
 * @param [context] The context for the call.
 * @param [path] The path to append the bridge segment to.
 * @param [start] The coordinates of the starting point of the bridge.
 * @param [end] The coordinates of the ending point of the bridge.
 * @param [gapLength] The distance between the starting point and the end point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBridgeCreator%23IBridgeCreator-method-createCustomBridge">Online Documentation</a>
 */
   fun createCustomBridge( context: IRenderContext ,
 path: GeneralPath ,
 start: Point ,
 end: Point ,
 gapLength: Double )
/**
 * Gets the height of the bridge for the given [IRenderContext].
 * @param [context] The context where the bridge will be created for.
 * @return The non-negative preferred basic unscaled height of the bridge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBridgeCreator%23IBridgeCreator-method-getBridgeHeight">Online Documentation</a>
 */
   fun getBridgeHeight( context: IRenderContext ):Double
/**
 * Gets the width of the bridge for the given [IRenderContext].
 * @param [context] The context where the bridge will be created for.
 * @return The positive preferred width of the bridge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBridgeCreator%23IBridgeCreator-method-getBridgeWidth">Online Documentation</a>
 */
   fun getBridgeWidth( context: IRenderContext ):Double
/**
 * Gets the [BridgeCrossingStyle] to use in the given [IRenderContext].
 * @param [context] The context in which the crossing will be used.
 * @return The style to use, or [BridgeCrossingStyle.CUSTOM] in order to let [BridgeManager] call [createCustomBridge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBridgeCreator%23IBridgeCreator-method-getCrossingStyle">Online Documentation</a>
 */
   fun getCrossingStyle( context: IRenderContext ):BridgeCrossingStyle
/**
 * Gets the [BridgeOrientationStyle] to use in the given [IRenderContext].
 * @param [context] The context in which the style will be used..
 * @return The style to use. Any value can be returned and will be ignored if the [crossing style][getCrossingStyle] is set to [BridgeCrossingStyle.CUSTOM].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBridgeCreator%23IBridgeCreator-method-getOrientationStyle">Online Documentation</a>
 */
   fun getOrientationStyle( context: IRenderContext ):BridgeOrientationStyle

companion object : InterfaceMetadata<IBridgeCreator> {
}
}
