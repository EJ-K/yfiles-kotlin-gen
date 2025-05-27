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
 * Default renderer implementation for [ArcEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-constructor-ArcEdgeStyleRenderer">Online Documentation</a>
 */
external open class ArcEdgeStyleRenderer  () : PathBasedEdgeStyleRenderer<ArcEdgeStyle> {

/**
 * Gets whether bridges are added to the edge path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23addBridges">Online Documentation</a>
 */
override val addBridges: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-configure">Online Documentation</a>
 */
 override   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-createPath">Online Documentation</a>
 */
 override   fun createPath():GeneralPath
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-cropPath">Online Documentation</a>
 */
 override   fun cropPath( path: GeneralPath ):GeneralPath
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 override   fun getCssClass():String
/**
 * Retrieves the [ArcEdgeStyle.height] of the style.
 * @return the height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-getHeight">Online Documentation</a>
 */
 open   fun getHeight():Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-getSegmentCount">Online Documentation</a>
 */
 override   fun getSegmentCount():Int
/**
 * Gets the source arrow from the style via [ArcEdgeStyle.sourceArrow].
 * @return The arrow to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-getSourceArrow">Online Documentation</a>
 */
 override   fun getSourceArrow():IArrow?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 override   fun getStroke():Stroke?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-getTangent">Online Documentation</a>
 */
 override   fun getTangent( ratio: Double ):Tangent?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-getTangentForSegment">Online Documentation</a>
 */
 override   fun getTangentForSegment( segmentIndex: Int ,
 ratio: Double ):Tangent?
/**
 * Gets the target arrow from the style via [ArcEdgeStyle.targetArrow].
 * @return The arrow to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-getTargetArrow">Online Documentation</a>
 */
 override   fun getTargetArrow():IArrow?
/**
 * Gets a value indicating whether this [getHeight] should be interpreted as an absolute or relative value.
 * @return `true` if the height value should be interpreted as a fixed value, otherwise, `false`.
 * @see [getHeight]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-isFixedHeight">Online Documentation</a>
 */
 open   fun isFixedHeight():Boolean
/**
 * Overridden for performance reasons.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArcEdgeStyleRenderer%23ArcEdgeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<ArcEdgeStyleRenderer> {
}
}

inline fun ArcEdgeStyleRenderer(
    block: ArcEdgeStyleRenderer.() -> Unit
): ArcEdgeStyleRenderer {
    return ArcEdgeStyleRenderer()
        .apply(block)
}
