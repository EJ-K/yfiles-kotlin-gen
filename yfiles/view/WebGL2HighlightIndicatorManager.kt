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
 * A specialization of the [HighlightIndicatorManager] class that delegates its work to [WebGL2GraphModelManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23WebGL2HighlightIndicatorManager-constructor-WebGL2HighlightIndicatorManager">Online Documentation</a>
 */
external  class WebGL2HighlightIndicatorManager  () : HighlightIndicatorManager<IModelItem> {

/**
 * Gets or sets the style to use for the edge label highlight rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23edgeLabelStyle">Online Documentation</a>
 */
final var edgeLabelStyle: WebGL2LabelIndicatorStyle
/**
 * Gets or sets the style to use for the edge highlight rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23edgeStyle">Online Documentation</a>
 */
final var edgeStyle: WebGL2EdgeIndicatorStyle
/**
 * Gets or sets the style to use for the node label highlight rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23nodeLabelStyle">Online Documentation</a>
 */
final var nodeLabelStyle: WebGL2LabelIndicatorStyle
/**
 * Gets or sets the style to use for the node highlight rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23nodeStyle">Online Documentation</a>
 */
final var nodeStyle: Any /* WebGL2NodeIndicatorStyle | WebGL2BeaconNodeIndicatorStyle */
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23WebGL2HighlightIndicatorManager-method-addItem">Online Documentation</a>
 */
 final override   fun addItem( item: IModelItem ):ICanvasObject?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23WebGL2HighlightIndicatorManager-method-install">Online Documentation</a>
 */
 final override   fun install( canvas: CanvasComponent )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23WebGL2HighlightIndicatorManager-method-removeItem">Online Documentation</a>
 */
 final override   fun removeItem( item: IModelItem )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2HighlightIndicatorManager%23WebGL2HighlightIndicatorManager-method-uninstall">Online Documentation</a>
 */
 final override   fun uninstall( canvas: CanvasComponent )

companion object : ClassMetadata<WebGL2HighlightIndicatorManager> {
}
}

inline fun WebGL2HighlightIndicatorManager(
    block: WebGL2HighlightIndicatorManager.() -> Unit
): WebGL2HighlightIndicatorManager {
    return WebGL2HighlightIndicatorManager()
        .apply(block)
}
