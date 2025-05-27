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
 * Default renderer implementation for [BridgeEdgeStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-constructor-BridgeEdgeStyleRenderer">Online Documentation</a>
 */
external open class BridgeEdgeStyleRenderer  () : PathBasedEdgeStyleRenderer<BridgeEdgeStyle> {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-configure">Online Documentation</a>
 */
 override   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-createPath">Online Documentation</a>
 */
 override   fun createPath():GeneralPath
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 override   fun getCssClass():String
/**
 * Retrieves the [BridgeEdgeStyle.fanLength] of the style.
 * @return Fan length of the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getFanLength">Online Documentation</a>
 */
 open protected   fun getFanLength():Double
/**
 * Retrieves the [BridgeEdgeStyle.height] of the style.
 * @return Height of the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getHeight">Online Documentation</a>
 */
 open protected   fun getHeight():Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getSegmentCount">Online Documentation</a>
 */
 override   fun getSegmentCount():Int
/**
 * Gets the source arrow from the style via [BridgeEdgeStyle.sourceArrow].
 * @return The arrow to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getSourceArrow">Online Documentation</a>
 */
 override   fun getSourceArrow():IArrow?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 override   fun getStroke():Stroke?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getTangent">Online Documentation</a>
 */
 override   fun getTangent( ratio: Double ):Tangent?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getTangentForSegment">Online Documentation</a>
 */
 override   fun getTangentForSegment( segmentIndex: Int ,
 ratio: Double ):Tangent?
/**
 * Gets the target arrow from the style via [BridgeEdgeStyle.targetArrow].
 * @return The arrow to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-getTargetArrow">Online Documentation</a>
 */
 override   fun getTargetArrow():IArrow?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeEdgeStyleRenderer%23BridgeEdgeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<BridgeEdgeStyleRenderer> {
}
}

inline fun BridgeEdgeStyleRenderer(
    block: BridgeEdgeStyleRenderer.() -> Unit
): BridgeEdgeStyleRenderer {
    return BridgeEdgeStyleRenderer()
        .apply(block)
}
