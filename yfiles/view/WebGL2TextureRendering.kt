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
 * Rendering hints that can be applied to [WebGL2IconNodeStyle], [WebGL2DefaultLabelStyle], and [WebGL2IconLabelStyle] to define how the labels and text will be rendered when zoomed in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2TextureRendering">Online Documentation</a>
 */
external class WebGL2TextureRendering 
    private constructor(): YFlags<WebGL2TextureRendering> {
    companion object {
    /**
 * Use a linear interpolation when zooming in.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2TextureRendering%23INTERPOLATED">Online Documentation</a>
 */
val INTERPOLATED: WebGL2TextureRendering
/**
 * Uses a cut-off value for interpolated alpha values to obtain sharp edges at icon boundaries when zoomed in.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2TextureRendering%23SDF">Online Documentation</a>
 */
val SDF: WebGL2TextureRendering

    }
}
