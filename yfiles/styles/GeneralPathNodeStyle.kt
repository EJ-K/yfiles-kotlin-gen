// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.lang.ClassMetadata
import yfiles.view.Fill
import yfiles.view.Stroke

/**
 * A node style that can display node shapes with a boundary that is defined by a [GeneralPath] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the specified path.
 * @param [path] The path that defines the boundary of this style. The path must be defined in such a way that the point (0,0) represents the top left of a node's [layout][yfiles.graph.INode] and the point (1,1) the lower right. The path will be scaled accordingly to the node's size. If not specified, a simple rectangular path is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23GeneralPathNodeStyle-constructor-GeneralPathNodeStyle">Online Documentation</a>
 */
external class GeneralPathNodeStyle (
  path: GeneralPath  = definedExternally,
) : INodeStyle {
  /**
   * Gets or sets the aspect ratio for scaling the path to a node's size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23aspectRatio">Online Documentation</a>
   */
  final var aspectRatio: Double
  
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets the [Fill] that is used to draw the shape.
   * 
   * The default value is [WHITE][yfiles.view.Color].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23fill">Online Documentation</a>
   */
  final var fill: Fill?
  
  /**
   * Get or sets the path that defines the boundary of the shape.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23path">Online Documentation</a>
   */
  final var path: GeneralPath?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * Gets or sets the [Stroke] that is used to draw the shape.
   * 
   * The default value is [BLACK][Stroke].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23stroke">Online Documentation</a>
   */
  final var stroke: Stroke?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23GeneralPathNodeStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): GeneralPathNodeStyle
  
  companion object : ClassMetadata<GeneralPathNodeStyle> {
    /**
     * Creates a new [GeneralPathNodeStyle] instance for a copy of the given path.
     * @param [path] The path that defines the outline of a node's visualization. The width and height of its bounds have to be positive and finite.
     * @return A [GeneralPathNodeStyle] instance using the path and its aspect ratio.
     * @throws ArgumentError If the width or height of the given path's bounds is not positive and finite.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23GeneralPathNodeStyle-method-createAspectRatioInstance">Online Documentation</a>
     */
    fun createAspectRatioInstance(
      path: GeneralPath,
    ): GeneralPathNodeStyle
    
    /**
     * Creates a [GeneralPath] in the form of a polygon.
     * @param [pointCount] The number of corners of the polygon. For odd numbers, the first corner points to the top.
     * @param [rotationAngle] The rotation angle of the polygon. The angle is specified in radians, measured clockwise.
     * @param [stretchToHeight] Whether to stretch the path to the full bounding box height.
     * @param [stretchToWidth] Whether to stretch the path to the full bounding box width.
     * @return The polygonal [GeneralPath].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23GeneralPathNodeStyle-method-createPolygonPath">Online Documentation</a>
     */
    fun createPolygonPath(
      pointCount: Int,
      rotationAngle: Double  = definedExternally,
      stretchToHeight: Boolean  = definedExternally,
      stretchToWidth: Boolean  = definedExternally,
    ): GeneralPath
    
    /**
     * Creates a [GeneralPath] in the form of a star.
     * @param [pointCount] The number of points of the star. For odd numbers, the first corner points to the top.
     * @param [ratio] The ratio between the inner and outer points radius. The ratio should be a positive number smaller or equal to 1. For values > 1, the reciprocal is used.
     * @param [rotationAngle] The rotation angle of the star. The angle is specified in radians, measured clockwise.
     * @param [stretchToHeight] Whether to stretch the path to the full bounding box height.
     * @param [stretchToWidth] Whether to stretch the path to the full bounding box width.
     * @return A star-shaped [GeneralPath].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23GeneralPathNodeStyle-method-createStarPath">Online Documentation</a>
     */
    fun createStarPath(
      pointCount: Int,
      ratio: Double,
      rotationAngle: Double  = definedExternally,
      stretchToHeight: Boolean  = definedExternally,
      stretchToWidth: Boolean  = definedExternally,
    ): GeneralPath
  }
}

inline fun GeneralPathNodeStyle(
    block: GeneralPathNodeStyle.() -> Unit
): GeneralPathNodeStyle {
    return GeneralPathNodeStyle()
        .apply(block)
}
