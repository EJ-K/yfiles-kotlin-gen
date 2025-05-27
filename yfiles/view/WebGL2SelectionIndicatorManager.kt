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
 * A specialization of the [SelectionIndicatorManager] class that delegates its work to [WebGL2GraphModelManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates an instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23WebGL2SelectionIndicatorManager-constructor-WebGL2SelectionIndicatorManager">Online Documentation</a>
 */
external  class WebGL2SelectionIndicatorManager  () : SelectionIndicatorManager<IModelItem> {

/**
 * Gets or sets the style to use for the edge label selection rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23edgeLabelStyle">Online Documentation</a>
 */
final var edgeLabelStyle: WebGL2LabelIndicatorStyle
/**
 * Gets or sets the style to use for the edge selection rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23edgeStyle">Online Documentation</a>
 */
final var edgeStyle: WebGL2EdgeIndicatorStyle
/**
 * Gets or sets the style to use for the node label selection rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23nodeLabelStyle">Online Documentation</a>
 */
final var nodeLabelStyle: WebGL2LabelIndicatorStyle
/**
 * Gets or sets the style to use for the node selection rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23nodeStyle">Online Documentation</a>
 */
final var nodeStyle: Any /* WebGL2NodeIndicatorStyle | WebGL2BeaconNodeIndicatorStyle */
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23WebGL2SelectionIndicatorManager-method-addSelection">Online Documentation</a>
 */
 final override   fun addSelection( item: IModelItem ):ICanvasObject?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23WebGL2SelectionIndicatorManager-method-install">Online Documentation</a>
 */
 final override   fun install( canvas: CanvasComponent )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23WebGL2SelectionIndicatorManager-method-removeSelection">Online Documentation</a>
 */
 final override   fun removeSelection( item: IModelItem )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2SelectionIndicatorManager%23WebGL2SelectionIndicatorManager-method-uninstall">Online Documentation</a>
 */
 final override   fun uninstall( canvas: CanvasComponent )

companion object : ClassMetadata<WebGL2SelectionIndicatorManager> {
}
}

inline fun WebGL2SelectionIndicatorManager(
    block: WebGL2SelectionIndicatorManager.() -> Unit
): WebGL2SelectionIndicatorManager {
    return WebGL2SelectionIndicatorManager()
        .apply(block)
}
