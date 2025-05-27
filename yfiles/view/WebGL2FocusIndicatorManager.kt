// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * A specialization of the [FocusIndicatorManager] class that delegates its work to [WebGL2GraphModelManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FocusIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FocusIndicatorManager%23WebGL2FocusIndicatorManager-constructor-WebGL2FocusIndicatorManager">Online Documentation</a>
 */
external  class WebGL2FocusIndicatorManager  () : FocusIndicatorManager<IModelItem> {

/**
 * Gets or sets the style to use for the edge label focus rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FocusIndicatorManager%23edgeLabelStyle">Online Documentation</a>
 */
final var edgeLabelStyle: WebGL2LabelIndicatorStyle
/**
 * Gets or sets the style to use for the edge focus rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FocusIndicatorManager%23edgeStyle">Online Documentation</a>
 */
final var edgeStyle: WebGL2EdgeIndicatorStyle
/**
 * Gets or sets the style to use for the node label focus rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FocusIndicatorManager%23nodeLabelStyle">Online Documentation</a>
 */
final var nodeLabelStyle: WebGL2LabelIndicatorStyle
/**
 * Gets or sets the style to use for the node focus rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FocusIndicatorManager%23nodeStyle">Online Documentation</a>
 */
final var nodeStyle: Any /* WebGL2NodeIndicatorStyle | WebGL2BeaconNodeIndicatorStyle */
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FocusIndicatorManager%23WebGL2FocusIndicatorManager-method-install">Online Documentation</a>
 */
 final override   fun install( canvas: CanvasComponent )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FocusIndicatorManager%23WebGL2FocusIndicatorManager-method-uninstall">Online Documentation</a>
 */
 final override   fun uninstall( canvas: CanvasComponent )

companion object : ClassMetadata<WebGL2FocusIndicatorManager> {
}
}

inline fun WebGL2FocusIndicatorManager(
    block: WebGL2FocusIndicatorManager.() -> Unit
): WebGL2FocusIndicatorManager {
    return WebGL2FocusIndicatorManager()
        .apply(block)
}
