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
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Tangent
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.ICanvasContext
import yfiles.view.Stroke

/**
 * Default renderer implementation for [BezierEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-constructor-BezierEdgeStyleRenderer">Online Documentation</a>
 */
external open class BezierEdgeStyleRenderer  () : PathBasedEdgeStyleRenderer<BezierEdgeStyle> {

/**
 * Overridden to always return `false`, since no bridges can be added in a meainingful way to a bezier path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23addBridges">Online Documentation</a>
 */
override val addBridges: Boolean
/**
 * Converts the edge bends into a cubic bezier path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-createPath">Online Documentation</a>
 */
 override   fun createPath():GeneralPath
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 override   fun getCssClass():String
/**
 * Returns the number of line, cubic and close operations in the renderer's path
 * @return The number of line, cubic and close operations in the renderer's path, or 0 if no path exists.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-getSegmentCount">Online Documentation</a>
 */
 override   fun getSegmentCount():Int
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-getSourceArrow">Online Documentation</a>
 */
 override   fun getSourceArrow():IArrow?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 override   fun getStroke():Stroke?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-getTangent">Online Documentation</a>
 */
 override   fun getTangent( ratio: Double ):Tangent?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-getTangentForSegment">Online Documentation</a>
 */
 override   fun getTangentForSegment( segmentIndex: Int ,
 ratio: Double ):Tangent?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-getTargetArrow">Online Documentation</a>
 */
 override   fun getTargetArrow():IArrow?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyleRenderer%23BezierEdgeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<BezierEdgeStyleRenderer> {
}
}

inline fun BezierEdgeStyleRenderer(
    block: BezierEdgeStyleRenderer.() -> Unit
): BezierEdgeStyleRenderer {
    return BezierEdgeStyleRenderer()
        .apply(block)
}
