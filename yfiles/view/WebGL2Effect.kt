// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.YFlags

/**
 * Defines the effects that can be applied to [WebGL2ShapeNodeStyle], [WebGL2IconNodeStyle], [WebGL2GroupNodeStyle], [WebGL2PolylineEdgeStyle], [WebGL2DefaultLabelStyle], and [WebGL2IconLabelStyle].
 * @see [WebGL2ShapeNodeStyle.effect]
 * @see [WebGL2IconNodeStyle.effect]
 * @see [WebGL2GroupNodeStyle.effect]
 * @see [WebGL2PolylineEdgeStyle.effect]
 * @see [WebGL2DefaultLabelStyle.effect]
 * @see [WebGL2IconLabelStyle.effect]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Effect">Online Documentation</a>
 */
external class WebGL2Effect 
    private constructor(): YFlags<WebGL2Effect> {
    companion object {
    /**
 * Do not apply any specific effect.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Effect%23NONE">Online Documentation</a>
 */
val NONE: WebGL2Effect
/**
 * Applies a soft drop-shadow effect.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Effect%23SHADOW">Online Documentation</a>
 */
val SHADOW: WebGL2Effect
/**
 * Applies a soft ambient light to the node using the [WebGL2ShapeNodeStyle.fill] from the node.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Effect%23AMBIENT_FILL_COLOR">Online Documentation</a>
 */
val AMBIENT_FILL_COLOR: WebGL2Effect
/**
 * Applies a soft ambient light to the node using the [WebGL2ShapeNodeStyle.stroke] from the node.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Effect%23AMBIENT_STROKE_COLOR">Online Documentation</a>
 */
val AMBIENT_STROKE_COLOR: WebGL2Effect
/**
 * Additional modifier that will make the ambient light effects be rendered in view coordinates instead of world coordinates.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Effect%23USE_VIEW_COORDINATES">Online Documentation</a>
 */
val USE_VIEW_COORDINATES: WebGL2Effect

    }
}
