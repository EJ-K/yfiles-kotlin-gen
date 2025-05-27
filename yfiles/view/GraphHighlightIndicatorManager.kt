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
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle
import yfiles.styles.IPortStyle

/**
 * A [HighlightIndicatorManager] for graph items that supports using styles to indicate the highlight.
 * @see [GraphSelectionIndicatorManager]
 * @see [GraphFocusIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager%23GraphHighlightIndicatorManager-constructor-GraphHighlightIndicatorManager">Online Documentation</a>
 */
external open class GraphHighlightIndicatorManager  () : HighlightIndicatorManager<IModelItem> {

/**
 * Gets or sets the style to use for the edge highlight rendering.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager%23edgeStyle">Online Documentation</a>
 */
final var edgeStyle: IEdgeStyle?
/**
 * Gets or sets the style to use for the label highlight rendering.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager%23labelStyle">Online Documentation</a>
 */
final var labelStyle: ILabelStyle?
/**
 * Gets or sets the style to use for the node highlight rendering.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager%23nodeStyle">Online Documentation</a>
 */
final var nodeStyle: INodeStyle?
/**
 * Gets or sets the style to use for the port highlight rendering.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager%23portStyle">Online Documentation</a>
 */
final var portStyle: IPortStyle?
/**
 * Called by [ModelManager.installItem] to retrieve the installer for a given item.
 * @param [item] The item to find an installer for.
 * @return An installer or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager%23GraphHighlightIndicatorManager-method-getInstaller">Online Documentation</a>
 */
 override   fun getInstaller( item: IModelItem ):ICanvasObjectInstaller<IModelItem>?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager%23GraphHighlightIndicatorManager-method-install">Online Documentation</a>
 */
 override   fun install( canvas: CanvasComponent )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphHighlightIndicatorManager%23GraphHighlightIndicatorManager-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( canvas: CanvasComponent )

companion object : ClassMetadata<GraphHighlightIndicatorManager> {
}
}

inline fun GraphHighlightIndicatorManager(
    block: GraphHighlightIndicatorManager.() -> Unit
): GraphHighlightIndicatorManager {
    return GraphHighlightIndicatorManager()
        .apply(block)
}
