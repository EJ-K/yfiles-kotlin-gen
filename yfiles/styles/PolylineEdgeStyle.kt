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
 * A polygonal [IEdgeStyle] where straight line segments are used to connect the bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23PolylineEdgeStyle-constructor-PolylineEdgeStyle">Online Documentation</a>
 */
external class PolylineEdgeStyle () : IEdgeStyle {
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets whether edges using this style should be created or edited orthogonally.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23orthogonalEditing">Online Documentation</a>
   */
  final var orthogonalEditing: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: IEdgeStyleRenderer
  
  /**
   * Gets or sets the smoothing length used for creating smooth bends.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23smoothingLength">Online Documentation</a>
   */
  final var smoothingLength: Double
  
  /**
   * Gets or sets the visual arrow at the source end of edges that use this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23sourceArrow">Online Documentation</a>
   */
  final var sourceArrow: IArrow
  
  /**
   * Gets or sets the [stroke][PolylineEdgeStyle] for the line.
   * 
   * The default value is [BLACK][Stroke].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23stroke">Online Documentation</a>
   */
  final var stroke: Stroke?
  
  /**
   * Gets or sets the visual arrow at the target end of edges that use this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23targetArrow">Online Documentation</a>
   */
  final var targetArrow: IArrow
  
  /**
   * Performs a memberwise clone.
   * @return The memberwise clone of the PolylineEdgeStyle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23PolylineEdgeStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): PolylineEdgeStyle
  
  companion object : ClassMetadata<PolylineEdgeStyle> {
  }
}

inline fun PolylineEdgeStyle(
    block: PolylineEdgeStyle.() -> Unit
): PolylineEdgeStyle {
    return PolylineEdgeStyle()
        .apply(block)
}
