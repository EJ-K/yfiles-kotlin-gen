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
 * @constructor Creates a new instance using the specified path and a custom renderer instance.
 * @param [path] The path that defines the boundary of this style. The path must be defined in such a way that the point (0,0) represents the top left of a node's [INode.layout][yfiles.graph.INode.layout] and the point (1,1) the lower right. The path will be scaled accordingly to the node's size. If not specified, a simple rectangular path is used.
 * @param [renderer] Custom renderer instance for this style. If none is provided, a new instance of the [default implementation][GeneralPathNodeStyleRenderer] will be used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23GeneralPathNodeStyle-constructor-GeneralPathNodeStyle">Online Documentation</a>
 */
external open class GeneralPathNodeStyle  ( path: GeneralPath?  = definedExternally,
 renderer: GeneralPathNodeStyleRenderer?  = definedExternally) : INodeStyle {

/**
 * Gets or sets the aspect ratio for scaling the path to a node's size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23aspectRatio">Online Documentation</a>
 */
open var aspectRatio: Double
/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the [Fill] that is used to draw the shape.
 * 
 * The default value is [Fill.WHITE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23fill">Online Documentation</a>
 */
open var fill: Fill?
/**
 * Get or sets the path that defines the boundary of the shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23path">Online Documentation</a>
 */
open var path: GeneralPath?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: GeneralPathNodeStyleRenderer
/**
 * Gets or sets the [Stroke] that is used to draw the shape.
 * 
 * The default value is [Stroke.BLACK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23stroke">Online Documentation</a>
 */
open var stroke: Stroke?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23GeneralPathNodeStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():GeneralPathNodeStyle

companion object : ClassMetadata<GeneralPathNodeStyle> {
/**
 * Creates a new [GeneralPathNodeStyle] instance for a copy of the given path.
 * @param [path] The path that defines the outline of a node's visualization. The width and height of its bounds have to be positive and finite.
 * @throws ArgumentError If the width or height of the given path's bounds is not positive and finite.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPathNodeStyle%23GeneralPathNodeStyle-method-createAspectRatioInstance">Online Documentation</a>
 */
 final   fun createAspectRatioInstance( path: GeneralPath ):GeneralPathNodeStyle
}
}

inline fun GeneralPathNodeStyle(
    block: GeneralPathNodeStyle.() -> Unit
): GeneralPathNodeStyle {
    return GeneralPathNodeStyle()
        .apply(block)
}
