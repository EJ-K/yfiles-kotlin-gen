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
import yfiles.geometry.Rect
import yfiles.geometry.Tangent
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.ICanvasContext
import yfiles.view.Stroke

/**
 * An [IEdgeStyleRenderer] that will render [PolylineEdgeStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-constructor-PolylineEdgeStyleRenderer">Online Documentation</a>
 */
external open class PolylineEdgeStyleRenderer  () : PathBasedEdgeStyleRenderer<PolylineEdgeStyle> {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-createPath">Online Documentation</a>
 */
 override   fun createPath():GeneralPath
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 override   fun getCssClass():String
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-getSegmentCount">Online Documentation</a>
 */
 override   fun getSegmentCount():Int
/**
 * Gets the value that determines the radius of the smoothing arcs that can be added to the path at the bends.
 * @return The radius of the arcs to use at the bends of the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-getSmoothingLength">Online Documentation</a>
 */
 override   fun getSmoothingLength():Double
/**
 * Gets the source arrow from the style via [PolylineEdgeStyle.sourceArrow].
 * @return The arrow to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-getSourceArrow">Online Documentation</a>
 */
 override   fun getSourceArrow():IArrow?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 override   fun getStroke():Stroke?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-getTangent">Online Documentation</a>
 */
 override   fun getTangent( ratio: Double ):Tangent?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-getTangentForSegment">Online Documentation</a>
 */
 override   fun getTangentForSegment( segmentIndex: Int ,
 ratio: Double ):Tangent?
/**
 * Gets the target arrow from the style via [PolylineEdgeStyle.targetArrow].
 * @return The arrow to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-getTargetArrow">Online Documentation</a>
 */
 override   fun getTargetArrow():IArrow?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyleRenderer%23PolylineEdgeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<PolylineEdgeStyleRenderer> {
}
}

inline fun PolylineEdgeStyleRenderer(
    block: PolylineEdgeStyleRenderer.() -> Unit
): PolylineEdgeStyleRenderer {
    return PolylineEdgeStyleRenderer()
        .apply(block)
}
