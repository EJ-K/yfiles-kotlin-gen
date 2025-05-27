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
 * Provides an arc representation for an edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23ArcEdgeStyle-constructor-ArcEdgeStyle">Online Documentation</a>
 */
external class ArcEdgeStyle () : IEdgeStyle {
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets a value indicating whether this [ArcEdgeStyle] interprets the [height][ArcEdgeStyle] value as an absolute or relative value.
   * 
   * The default value is `true`.
   * @see [height]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23fixedHeight">Online Documentation</a>
   */
  final var fixedHeight: Boolean
  
  /**
   * Gets or sets the "height" of the arc.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23height">Online Documentation</a>
   */
  final var height: Double
  
  /**
   * Gets or sets a value indicating whether the [renderer][ArcEdgeStyle] should provide an [IHandle][yfiles.input.IHandle] if queried for the [IHandleProvider][yfiles.input.IHandleProvider] implementation that allows for adjusting the [height][ArcEdgeStyle] of this instance.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23provideHeightHandle">Online Documentation</a>
   */
  final var provideHeightHandle: Boolean
  
  /**
   * Gets the renderer implementation that has been supplied to this instance in the constructor.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: IEdgeStyleRenderer
  
  /**
   * Gets or sets the visual arrow at the source end of edges that use this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23sourceArrow">Online Documentation</a>
   */
  final var sourceArrow: IArrow
  
  /**
   * Gets or sets the [stroke][ArcEdgeStyle] that is used to draw the arc
   * 
   * The default value is [BLACK][Stroke].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23stroke">Online Documentation</a>
   */
  final var stroke: Stroke?
  
  /**
   * Gets or sets the visual arrow at the target end of edges that use this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23targetArrow">Online Documentation</a>
   */
  final var targetArrow: IArrow
  
  /**
   * Performs a memberwise clone.
   * @return A memberwise clone of this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyle%23ArcEdgeStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): ArcEdgeStyle
  
  companion object : ClassMetadata<ArcEdgeStyle> {
  }
}

inline fun ArcEdgeStyle(
    block: ArcEdgeStyle.() -> Unit
): ArcEdgeStyle {
    return ArcEdgeStyle()
        .apply(block)
}
