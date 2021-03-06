/*
 * Tigase XMPP Server - The instant messaging server
 * Copyright (C) 2004 Tigase, Inc. (office@tigase.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. Look for COPYING file in the top folder.
 * If not, see http://www.gnu.org/licenses/.
 */

package tigase.server.xmppserver;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.logging.Level;

@Ignore
public class S2SConnManDomainTest
		extends S2SConnManAbstractTest {

	@BeforeClass
	public static void setup() {
		System.setProperty("test-ssl-debug", "false");
		S2SConnManAbstractTest.setup();
		configureLogger(log, Level.INFO);
	}


	@Test
	public void testS2S_convorb_im() {
		setupCID("tigase.im", "convorb.im");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_404_city() {
		setupCID("tigase.im", "404.city");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_frsra_ml() {
		setupCID("tigase.im", "frsra.ml");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_jabber_ru() {
		setupCID("tigase.im", "jabber.ru");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_jabberix_com() {
		setupCID("tigase.im", "jabberix.com");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_jwchat_org() {
		setupCID("tigase.im", "jwchat.org");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_vrcshop_com() {
		setupCID("tigase.im", "vrcshop.com");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_axeos_nl() {
		setupCID("tigase.im", "axeos.nl");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_tigase_org() {
		setupCID("tigase.im", "tigase.org");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_jit_si() {
		setupCID("tigase.im", "jit.si");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_jabber_org() {
		setupCID("tigase.im", "jabber.org");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_cluxia_eu() {
		setupCID("tigase.im", "cluxia.eu");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_rsocks_net() {
		// can't connect from 404.im, certificate not trusted ; jabster.pl: ejabberd 18.12.1
		setupCID("tigase.im", "rsocks.net");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_dismail_de() {
		// ejabberd 19.09.57
		setupCID("tigase.im", "dismail.de");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_legalize_li() {
		// can't connect from 404.im, certificate not trusted ; jabster.pl: ejabberd 18.12.1
		setupCID("tigase.im", "legalize.li");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_legaliza_live() {
		// invalid namespace?! / Openfire 4.4.2
		setupCID("tigase.im", "legaliza.live");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_jabber_cz() {
		// invalid namespace?! / Openfire 4.4.2
		setupCID("tigase.im", "jabber.cz");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_xmpp_jp() {
		// invalid namespace?! / Openfire 4.4.2
		setupCID("tigase.im", "xmpp.jp");
		testS2STigaseConnectionManager(null);
	}

	@Test
	public void testS2S_xmpp_uwpx_org() {
		// can't connect from 404.im, certificate not trusted ; jabster.pl: ejabberd, 19.09.1
		setupCID("tigase.im", "xmpp.uwpx.org");
		testS2STigaseConnectionManager(null);
	}

}
