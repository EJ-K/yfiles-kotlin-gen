// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.styles.GroupNodeStyleIconBackgroundShape
import yfiles.styles.GroupNodeStyleIconPosition
import yfiles.styles.GroupNodeStyleIconType
import yfiles.styles.GroupNodeStyleTabPosition
import yfiles.styles.GroupNodeStyleTabSizePolicy

/**
 * A node style for group nodes, that consists of a header and content portion.
 * @see [WebGL2IconNodeStyle]
 * @see [WebGL2ShapeNodeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new group node style that is rendered with WebGL2.
 * @param [tabFill] The main fill color of the node. Defaults to `rgb(170, 170, 170)`.
 * @param [contentAreaFill] The fill color of the content area where child nodes are placed, defaults to [Color.WHITE]
 * @param [tabBackgroundFill] The background fill color of the tab part, only applicable for tab positions that include a background such as [GroupNodeStyleTabPosition.TOP_TRAILING]. Defaults to [Color.TRANSPARENT].
 * @param [stroke] The stroke used for the outline. Defaults to no stroke./>
 * @param [cornerRadius] The outer corner radius. Defaults to `4.0`.
 * @param [tabSlope] For split tab positions, defines the slope between fore- and background portions of the tab area. Defaults to `0.5`.
 * @param [tabWidth] Width of the tab portion. Only has an effect on split tab positions. Defaults to `50`.
 * @param [tabHeight] Height of the tab portion. Defaults to `18`.
 * @param [tabInset] Determines distance between the content part and the outer portion of the style. Defaults to `4`
 * @param [showFolderContentArea] Whether to show the content area part. Defaults to `false`.
 * @param [tabPosition] The position of the tab, such as [GroupNodeStyleTabPosition.LEFT_LEADING]. Defaults to [GroupNodeStyleTabPosition.TOP].
 * @param [iconPosition] The position of the icon. This is independent of tabPosition. Defaults to [GroupNodeStyleIconPosition.TRAILING].
 * @param [groupIcon] The icon to be displayed. When displayed in an [IFoldingView][yfiles.graph.IFoldingView], this icon is shown for expanded nodes. Defaults to [GroupNodeStyleIconType.NONE].
 * @param [folderIcon] The icon to be displayed when the node is collapsed in an [IFoldingView][yfiles.graph.IFoldingView]. Defaults to [GroupNodeStyleIconType.NONE].
 * @param [iconBackgroundShape] The background shape to use for the icon. Defaults to [GroupNodeStyleIconBackgroundShape.ROUND_RECTANGLE_SOLID].
 * @param [iconBackgroundFill] The fill color of the icon background shape. Defaults to white.
 * @param [iconForegroundFill] Fill color of icon itself. Defaults to `rgb(170, 170, 170)`.
 * @param [iconSize] The size of the icon, if any. Defaults to `14`.
 * @param [iconOffset] The offset of the icon to the outline of the style. Defaults to `0`.
 * @param [effect] The effect around the node. Defaults to [WebGL2Effect.NONE].
 * @param [hitTransparentContentArea] Whether to make the content hit transparent. Defaults to `false`.
 * @param [tabSizePolicy] Determines how to calculate the size of the tab. Defaults to [GroupNodeStyleTabSizePolicy.FIXED]
 * @param [renderTransparentContentArea] Whether to allow transparent [Fill]es for the content area.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23WebGL2GroupNodeStyle-constructor-WebGL2GroupNodeStyle">Online Documentation</a>
 */
external  class WebGL2GroupNodeStyle  ( tabFill: Color?  = definedExternally,
 contentAreaFill: Color?  = definedExternally,
 tabBackgroundFill: Color?  = definedExternally,
 stroke: WebGL2Stroke?  = definedExternally,
 cornerRadius: Double  = definedExternally,
 tabSlope: Double  = definedExternally,
 tabWidth: Double  = definedExternally,
 tabHeight: Double  = definedExternally,
 tabInset: Double  = definedExternally,
 showFolderContentArea: Boolean  = definedExternally,
 tabPosition: GroupNodeStyleTabPosition  = definedExternally,
 iconPosition: GroupNodeStyleIconPosition  = definedExternally,
 groupIcon: GroupNodeStyleIconType  = definedExternally,
 folderIcon: GroupNodeStyleIconType  = definedExternally,
 iconBackgroundShape: GroupNodeStyleIconBackgroundShape  = definedExternally,
 iconBackgroundFill: Color?  = definedExternally,
 iconForegroundFill: Color?  = definedExternally,
 iconSize: Double  = definedExternally,
 iconOffset: Double  = definedExternally,
 effect: WebGL2Effect  = definedExternally,
 hitTransparentContentArea: Boolean  = definedExternally,
 tabSizePolicy: GroupNodeStyleTabSizePolicy  = definedExternally,
 renderTransparentContentArea: Boolean  = definedExternally) : YObject {

/**
 * The fill color used for the content area.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23contentAreaFill">Online Documentation</a>
 */
final val contentAreaFill: Color
/**
 * The inset around the content area for positioning of child nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23contentAreaInsets">Online Documentation</a>
 */
final val contentAreaInsets: Double
/**
 * To which extent the corners of the style should be rounded.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23cornerRadius">Online Documentation</a>
 */
final val cornerRadius: Double
/**
 * The effect applied to this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23effect">Online Documentation</a>
 */
final val effect: WebGL2Effect
/**
 * The icon to be shown when the group node is collapsed in an [IFoldingView][yfiles.graph.IFoldingView].
 * @see [groupIcon]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23folderIcon">Online Documentation</a>
 */
final val folderIcon: GroupNodeStyleIconType
/**
 * The icon to be displayed.
 * @see [folderIcon]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23groupIcon">Online Documentation</a>
 */
final val groupIcon: GroupNodeStyleIconType
/**
 * Gets or sets a value indicating whether the content area is hit transparent.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23hitTransparentContentArea">Online Documentation</a>
 */
final val hitTransparentContentArea: Boolean
/**
 * The fill color used for the background of the icon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23iconBackgroundFill">Online Documentation</a>
 */
final val iconBackgroundFill: Color
/**
 * The icon background shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23iconBackgroundShape">Online Documentation</a>
 */
final val iconBackgroundShape: GroupNodeStyleIconBackgroundShape
/**
 * The fill color used for the foreground of the icon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23iconForegroundFill">Online Documentation</a>
 */
final val iconForegroundFill: Color
/**
 * The offset of the icon relative to the outline.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23iconOffset">Online Documentation</a>
 */
final val iconOffset: Double
/**
 * The position of the icon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23iconPosition">Online Documentation</a>
 */
final val iconPosition: GroupNodeStyleIconPosition
/**
 * The icon size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23iconSize">Online Documentation</a>
 */
final val iconSize: Double
/**
 * Gets a value indicating whether to allow transparent [Fill]es for the content area.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23renderTransparentContentArea">Online Documentation</a>
 */
final val renderTransparentContentArea: Boolean
/**
 * Whether the content area is shown.
 * @see [contentAreaFill]
 * @see [tabInset]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23showFolderContentArea">Online Documentation</a>
 */
final val showFolderContentArea: Boolean
/**
 * The [WebGL2Stroke] used for drawing the outline of the shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23stroke">Online Documentation</a>
 */
final val stroke: WebGL2Stroke
/**
 * The fill color used for the tab background.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23tabBackgroundFill">Online Documentation</a>
 */
final val tabBackgroundFill: Color
/**
 * The fill color used for the tab foreground.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23tabFill">Online Documentation</a>
 */
final val tabFill: Color
/**
 * The height of the tab part.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23tabHeight">Online Documentation</a>
 */
final val tabHeight: Double
/**
 * The inset that shrinks the content area on all sides.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23tabInset">Online Documentation</a>
 */
final val tabInset: Double
/**
 * The position of the tab.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23tabPosition">Online Documentation</a>
 */
final val tabPosition: GroupNodeStyleTabPosition
/**
 * Gets or sets the policy that determines how to calculate the size of the tab.
 * @see [tabWidth]
 * @see [tabHeight]
 * @see [tabSlope]
 * @see [cornerRadius]
 * @see [GroupNodeLabelModel][yfiles.graph.GroupNodeLabelModel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23tabSizePolicy">Online Documentation</a>
 */
final val tabSizePolicy: GroupNodeStyleTabSizePolicy
/**
 * The slope between tab foreground and background, where 0 is a vertical slope, 0.5 is a 45° slope and positive numbers get progressively shallower.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23tabSlope">Online Documentation</a>
 */
final val tabSlope: Double
/**
 * The width of the tab part.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GroupNodeStyle%23tabWidth">Online Documentation</a>
 */
final val tabWidth: Double

companion object : ClassMetadata<WebGL2GroupNodeStyle> {
}
}
