// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ClassMetadata
import yfiles.view.Stroke

/**
 * Provides a bridge representation for an edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided renderer.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23BridgeEdgeStyle-constructor-BridgeEdgeStyle(BridgeEdgeStyleRenderer)">Online Documentation</a>
 * 
 * @property renderer
 * Gets the renderer implementation that has been supplied to this instance in the constructor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23renderer">Online Documentation</a>
 */
external open class BridgeEdgeStyle  (
final override val renderer: BridgeEdgeStyleRenderer = definedExternally) : IEdgeStyle {

/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the length of the "fan" part of the style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23fanLength">Online Documentation</a>
 */
final var fanLength: Double
/**
 * Gets or sets the height of the path.
 * 
 * The default value is `0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23height">Online Documentation</a>
 */
final var height: Double
/**
 * Gets or sets a value indicating whether the [BridgeEdgeStyleRenderer] should provide an [IHandle][yfiles.input.IHandle] if queried for the [IHandleProvider][yfiles.input.IHandleProvider] implementation that allows for adjusting the [height] of this instance.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23provideHeightHandle">Online Documentation</a>
 */
final var provideHeightHandle: Boolean
/**
 * Gets or sets the visual arrow at the source end of edges that use this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23sourceArrow">Online Documentation</a>
 */
final var sourceArrow: IArrow
/**
 * Gets or sets the [Stroke] that is used to draw the path
 * 
 * The default value is [Stroke.BLACK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23stroke">Online Documentation</a>
 */
final var stroke: Stroke?
/**
 * Gets or sets the visual arrow at the target end of edges that use this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23targetArrow">Online Documentation</a>
 */
final var targetArrow: IArrow
/**
 * Performs a [YObject.memberwiseClone][yfiles.lang.YObject.memberwiseClone]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyle%23BridgeEdgeStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():BridgeEdgeStyle

companion object : ClassMetadata<BridgeEdgeStyle> {
}
}

inline fun BridgeEdgeStyle(
    block: BridgeEdgeStyle.() -> Unit
): BridgeEdgeStyle {
    return BridgeEdgeStyle()
        .apply(block)
}
