// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Insets
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.view.Fill
import yfiles.view.Stroke

/**
 * A node style that draws a (rounded) rectangle with an optional ribbon or tab.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle">Online Documentation</a>
 * 
 * @constructor Initializes a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23GroupNodeStyle-constructor-GroupNodeStyle">Online Documentation</a>
 */
external class GroupNodeStyle () : INodeStyle {
  /**
   * Gets or sets the [Fill] used for the content area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23contentAreaFill">Online Documentation</a>
   */
  final var contentAreaFill: Fill?
  
  /**
   * Gets or sets the padding of the content area for this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23contentAreaPadding">Online Documentation</a>
   */
  final var contentAreaPadding: Insets
  
  /**
   * Gets or sets the radius of the arc used for rounding corners.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23cornerRadius">Online Documentation</a>
   */
  final var cornerRadius: Double
  
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets a value indicating whether to draw a drop shadow.
   * 
   * The default value is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23drawShadow">Online Documentation</a>
   */
  final var drawShadow: Boolean
  
  /**
   * Gets or sets the type of icon for collapsed nodes.
   * 
   * The default value is [PLUS][GroupNodeStyleIconType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23folderIcon">Online Documentation</a>
   */
  final var folderIcon: GroupNodeStyleIconType
  
  /**
   * Gets or sets the type of icon for expanded nodes.
   * 
   * The default value is [NONE][GroupNodeStyleIconType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23groupIcon">Online Documentation</a>
   */
  final var groupIcon: GroupNodeStyleIconType
  
  /**
   * Gets or sets a value indicating whether the content area is hit transparent.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23hitTransparentContentArea">Online Documentation</a>
   */
  final var hitTransparentContentArea: Boolean
  
  /**
   * Gets or sets the [Fill] used for the background of the icon.
   * 
   * The default value is [WHITE][yfiles.view.Color].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23iconBackgroundFill">Online Documentation</a>
   */
  final var iconBackgroundFill: Fill?
  
  /**
   * Gets or sets the type of background shape of the icon.
   * 
   * The default value is [ROUND_RECTANGLE_SOLID][GroupNodeStyleIconBackgroundShape].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23iconBackgroundShape">Online Documentation</a>
   */
  final var iconBackgroundShape: GroupNodeStyleIconBackgroundShape
  
  /**
   * Gets or sets the [Fill] used for the foreground of the icon.
   * 
   * The default value is a solid color brush for `r=170, g=170, b=170`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23iconForegroundFill">Online Documentation</a>
   */
  final var iconForegroundFill: Fill?
  
  /**
   * Gets or sets the offset of the icon.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23iconOffset">Online Documentation</a>
   */
  final var iconOffset: Double
  
  /**
   * Gets or sets the position of the icon.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23iconPosition">Online Documentation</a>
   */
  final var iconPosition: GroupNodeStyleIconPosition
  
  /**
   * Gets or sets the size of the icon.
   * 
   * The default value is `14.0`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23iconSize">Online Documentation</a>
   */
  final var iconSize: Double
  
  /**
   * Gets or sets the minimum size of the content area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23minimumContentAreaSize">Online Documentation</a>
   */
  final var minimumContentAreaSize: Size
  
  /**
   * Gets or sets a value indicating whether to allow transparent [Fill]es for the content area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23renderTransparentContentArea">Online Documentation</a>
   */
  final var renderTransparentContentArea: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * Gets or sets a value indicating whether the content area is displayed for collapsed nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23showFolderContentArea">Online Documentation</a>
   */
  final var showFolderContentArea: Boolean
  
  /**
   * Gets or sets the [Stroke] used for drawing the outline of the shape.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23stroke">Online Documentation</a>
   */
  final var stroke: Stroke?
  
  /**
   * Gets or sets the [Fill] used for the tab background.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23tabBackgroundFill">Online Documentation</a>
   */
  final var tabBackgroundFill: Fill?
  
  /**
   * Gets or sets the [Fill] used for the tab foreground.
   * 
   * The default value is a solid color brush for `r=170, g=170, b=170`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23tabFill">Online Documentation</a>
   */
  final var tabFill: Fill?
  
  /**
   * Gets or sets the height of the tab.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23tabHeight">Online Documentation</a>
   */
  final var tabHeight: Double
  
  /**
   * Gets or sets the padding of the tab.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23tabPadding">Online Documentation</a>
   */
  final var tabPadding: Double
  
  /**
   * Gets or sets the position of the tab.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23tabPosition">Online Documentation</a>
   */
  final var tabPosition: GroupNodeStyleTabPosition
  
  /**
   * Gets or sets the policy that determines how to calculate the size of the tab.
   * @see [tabWidth]
   * @see [tabHeight]
   * @see [tabSlope]
   * @see [cornerRadius]
   * @see [GroupNodeLabelModel][yfiles.graph.GroupNodeLabelModel]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23tabSizePolicy">Online Documentation</a>
   */
  final var tabSizePolicy: GroupNodeStyleTabSizePolicy
  
  /**
   * Gets or sets the slope of the tab.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23tabSlope">Online Documentation</a>
   */
  final var tabSlope: Double
  
  /**
   * Gets or sets the width of the tab.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23tabWidth">Online Documentation</a>
   */
  final var tabWidth: Double
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyle%23GroupNodeStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): GroupNodeStyle
  
  companion object : ClassMetadata<GroupNodeStyle> {
  }
}

inline fun GroupNodeStyle(
    block: GroupNodeStyle.() -> Unit
): GroupNodeStyle {
    return GroupNodeStyle()
        .apply(block)
}
